package eu.cactosfp7.cdosession.service;

import eu.cactosfp7.cdosession.CactosCdoSession;
import eu.cactosfp7.cdosession.settings.CactosUser;

public interface CdoSessionService {

	public static final String EVENT_TYPE = "eu/cactosfp7/cdosession/PropertiesReconfigured";

    public CactosCdoSession getCactosCdoSession(CactosUser cactosUser);

    public boolean isConfigured();
}
