package eu.cactosfp7.cdosession.settings;

import eu.cactosfp7.cdosession.service.CdoSession;

public enum CactosUser {

	CACTOOPT, CACTOSCALE, CACTOSIM;
	
	public String getUserKey(){
		if(this == CACTOOPT)
			return CdoSession.CACTOOPTUSER;
		else if(this == CACTOSCALE)
			return CdoSession.CACTOSCALEUSER;
		else if(this == CACTOSIM)
			return CdoSession.CACTOSIMUSER;
		else
			throw new RuntimeException("Cactos User unknown");
	}
	
	public String getPassKey(){
		if(this == CACTOOPT)
			return CdoSession.CACTOOPTPASSWORD;
		else if(this == CACTOSCALE)
			return CdoSession.CACTOSCALEPASSWORD;
		else if(this == CACTOSIM)
			return CdoSession.CACTOSIMPASSWORD;
		else
			throw new RuntimeException("Cactos User unknown");		
	}
}
