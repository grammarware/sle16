package eu.cactosfp7.cdosessionclient;


import org.apache.log4j.Logger;

import eu.cactosfp7.cdosession.service.CdoSessionService;

public final class CdoSessionClient {
	/** Logger for this class */
	private static final Logger logger = Logger.getLogger(CdoSessionClient.class);
	/** Singleton for allowing direct access to the CdoSessionService. */
	public static CdoSessionClient INSTANCE;

	/** The service providing CDO session handling. */
	private CdoSessionService service;
	
	public CdoSessionClient(){
		if(INSTANCE != null)
			throw new RuntimeException("Instantiating new CdoSessionClient is not allowed!");
		INSTANCE = this;
	}
	
	/**Bind method for discovered service.
	 * @param service The discovered service.
	 */
	public synchronized void bindService(CdoSessionService _service) {
		INSTANCE = this;
		service = _service;
		logger.info("CdoSessionService connected.");
	}
	
	/**Unbind method for discovered service.
	 * @param service The removed service.
	 */
	public synchronized void unbindService(CdoSessionService _service) {
		service = null;
		INSTANCE = null;
		logger.info("CdoSessionService disconnected.");
	}
	
	/**
	 * @return The service for CDO session.
	 */
	public CdoSessionService getService(){
		if(service == null)
			throw new RuntimeException("CdoSessionService unbound.");		
		return service;
	}
	
}
