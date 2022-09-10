package resources;

import pojoU.AddIssuer;

public class TestDataBuildU {
	
	public AddIssuer addIssuerPayload()
	{
		AddIssuer ai=new AddIssuer();
		
		ai.setAbbreviation("Issuer_Test_8241");
		ai.setAnalyst("Test824");
		ai.setBackupServicerId(824);		
		ai.setCollateralManagerId(824);
		ai.setCountryId(824);
		ai.setHasPublicEquity(false);
		ai.setIdentifier("Test123");
		ai.setIsabsIssuer(false);
		ai.setIsabsSponsor(false);
		ai.setIssueDate("2018-03-27T06:18:58.6908642-05:00");
		ai.setIssuerName("Issuer_Test_824");
		ai.setMarkitEntityId("sample2");
		ai.setMasterServicerId(1234);
		ai.setNotes("This is just for Testing");
		ai.setOriginalIssueSize(14.0);
		ai.setParentAffiliateId(1);
		ai.setState("Test9087");
		ai.setTrusteeId(9087);
		
		
		return ai;
		
	}

}
