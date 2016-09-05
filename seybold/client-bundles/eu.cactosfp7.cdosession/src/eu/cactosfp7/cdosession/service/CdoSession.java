package eu.cactosfp7.cdosession.service;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.common.CDOCommonSession.Options.PassiveUpdateMode;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOCollectionLoadingPolicy;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.net4j.util.security.IPasswordCredentialsProvider;
import org.eclipse.net4j.util.security.PasswordCredentialsProvider;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import eu.cactosfp7.cdosession.Activator;
import eu.cactosfp7.cdosession.CactosCdoSession;
import eu.cactosfp7.cdosession.settings.CactosUser;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;

public class CdoSession implements CdoSessionService, ManagedService {

	/** The logger for this class. */
	private static final Logger log = Logger.getLogger(CdoSession.class);

	/**
	 * cdo keys
	 */
	public static final String CDOENDPOINT = "cdoEndpoint";
	public static final String CDOREPO = "repositoryName";
	public static final String CDOAUTHENTICATED = "cdoAuthenticated";
	public static final String CDOCONNECTOR = "cdoConnectors";
	public static final String CDOPROTOCOL = "cdoProtocol";

	/**
	 * model path keys
	 */
	public static final String OPTIMISATIONPLANRESOURCE = "optimisationPlanResource";
	public static final String LOGICALMODELRESOURCE = "logicalModelResource";
	public static final String PHYSICALMODELRESOURCE = "physicalModelResource";
	public static final String LOGICALLOADRESOURCE = "logicalLoadResource";
	public static final String PHYSICALLOADRESOURCE = "physicalLoadResource";
	public static final String ARCHITECTURETYPERESOURCE = "architectureTypeResource";
	public static final String HYPERVISORRESOURCE = "hypervisorResource";

	/**
	 * CactoOpt specific keys
	 */
	public static final String CACTOOPTUSER = "cactoOptUser";
	public static final String CACTOOPTPASSWORD = "cactoOptPassword";

	/**
	 * CactoScale specific keys
	 */
	public static final String CACTOSCALEUSER = "cactoScaleUser";
	public static final String CACTOSCALEPASSWORD = "cactoScalePassword";

	/**
	 * CactoSim specific keys
	 */
	public static final String CACTOSIMUSER = "cactoSimUser";
	public static final String CACTOSIMPASSWORD = "cactoSimPassword";

	/**
	 * The properties provided by the ConfigAdminService
	 */
	private Dictionary<String, ?> properties;

	private final Map<CactosUser, CactosCdoSession> openSessions = new HashMap<CactosUser, CactosCdoSession>();

	@Override
	public CactosCdoSession getCactosCdoSession(CactosUser cactosUser) {
		// if there is no session yet, create one
		if (!openSessions.containsKey(cactosUser)) {
			createCactosCdoSession(cactosUser);
		}
		return openSessions.get(cactosUser);
	}

	/**
	 * Should be used in future!
	 * 
	 * @param cdoSession
	 * @param cdoSettings
	 * @return The session. <code>null</code> if no session could be
	 *         established.
	 */
	private CactosCdoSession createCactosCdoSession(CactosUser cactosUser) {
		try {
			CDONet4jSession cdoSession = createCdoSession(cactosUser);
			CactosCdoSession cactosCdoSession = new CactosCdoSession(cdoSession, this.properties);
			openSessions.put(cactosUser, cactosCdoSession);
			return cactosCdoSession;
		} catch (RuntimeException e) {
			log.info("Could not establish session to CDO server."+ e.getMessage());
			return null;
		}
	}

	private CDONet4jSession createCdoSession(CactosUser cactosUser) {
		Net4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Register Net4j
																// factories
		TCPUtil.prepareContainer(IPluginContainer.INSTANCE); // Register TCP
																// factories
		CDONet4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Register
																	// CDO
																	// factories
		// OCLQueryHandler.prepareContainer(IPluginContainer.INSTANCE);

		LifecycleUtil.activate(IPluginContainer.INSTANCE);

		final IConnector connector = TCPUtil.getConnector(IPluginContainer.INSTANCE, (String) this.properties.get(CdoSession.CDOENDPOINT));

		IPasswordCredentialsProvider credentialsProvider = getCredentialsFor(cactosUser);

		final CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
		config.setConnector(connector);
		config.setRepositoryName((String) this.properties.get(CdoSession.CDOREPO));
		config.setCredentialsProvider(credentialsProvider);
		config.setPassiveUpdateMode(PassiveUpdateMode.CHANGES);
		config.setPassiveUpdateEnabled(true);

		final CDONet4jSession session = config.openNet4jSession();
		session.options().setCollectionLoadingPolicy(CDOUtil.createCollectionLoadingPolicy(0, 300));
		session.getPackageRegistry().putEPackage(OptimisationplanPackage.eINSTANCE);

		return session;
	}

	private IPasswordCredentialsProvider getCredentialsFor(CactosUser cactosUser) {
		String user = (String) this.properties.get(cactosUser.getUserKey());
		String pass = (String) this.properties.get(cactosUser.getPassKey());
		return new PasswordCredentialsProvider(user, pass);
	}

	/*
	 * The following methods are for the ConfigAdminService
	 */

	@Override
	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		this.properties = properties;
		log.info("CdoSession configuration was set!");
		log.info("Notifying EventAdmin service.");
		final Event event = new Event(CdoSessionService.EVENT_TYPE, (Map<String, ?>) null);
		BundleContext context = Activator.getContext();
		ServiceReference<?> serviceReference = context.getServiceReference(EventAdmin.class.getName());
		if(serviceReference == null) {
		    ServiceListener sl = new ServiceListener() {
                
                @Override
                public void serviceChanged(ServiceEvent serviceEvent) {
                    triggerEventOnEventAdminReference(event, serviceEvent.getServiceReference());
                }
            };
            String filter = "(objectclass=" + EventAdmin.class.getName() + ")";
            try {
                context.addServiceListener(sl, filter);
            } catch (InvalidSyntaxException e) {
                throw new IllegalStateException("Could not obtain Event Admin from bundle context even though it should have been initialized.", e);
            }
        } else {
            triggerEventOnEventAdminReference(event, serviceReference);
        }
	}

    private void triggerEventOnEventAdminReference(final Event event, ServiceReference<?> serviceReference) {
        EventAdmin eventAdmin = (EventAdmin) Activator.getContext().getService(serviceReference);
        eventAdmin.postEvent(event);
    }

	/**
	 * Declarative Service <<method called by activating
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void activate(ComponentContext context) throws Exception {
		log.info("Activating: " + this.getClass().getName());
	}

	/**
	 * Declarative Service method called by deactivating
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void deactivate(ComponentContext context) throws Exception {
		log.info("Deactivating: " + this.getClass().getName());
	}

	@Override
	public boolean isConfigured() {
		return this.properties != null;
	}

}
