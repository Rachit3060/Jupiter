package pojoU;

public class AddIssuer {
	//This is pojo class for adding/updating Issuer
	private String abbreviation;
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getAnalyst() {
		return analyst;
	}
	public void setAnalyst(String analyst) {
		this.analyst = analyst;
	}
	public int getBackupServicerId() {
		return backupServicerId;
	}
	public void setBackupServicerId(int backupServicerId) {
		this.backupServicerId = backupServicerId;
	}
	public int getCollateralManagerId() {
		return collateralManagerId;
	}
	public void setCollateralManagerId(int collateralManagerId) {
		this.collateralManagerId = collateralManagerId;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public boolean getHasPublicEquity() {
		return hasPublicEquity;
	}
	public void setHasPublicEquity(boolean hasPublicEquity) {
		this.hasPublicEquity = hasPublicEquity;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public boolean getIsabsIssuer() {
		return isabsIssuer;
	}
	public void setIsabsIssuer(boolean isabsIssuer) {
		this.isabsIssuer = isabsIssuer;
	}
	public boolean getIsabsSponsor() {
		return isabsSponsor;
	}
	public void setIsabsSponsor(boolean isabsSponsor) {
		this.isabsSponsor = isabsSponsor;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public String getMarkitEntityId() {
		return markitEntityId;
	}
	public void setMarkitEntityId(String markitEntityId) {
		this.markitEntityId = markitEntityId;
	}
	public int getMasterServicerId() {
		return masterServicerId;
	}
	public void setMasterServicerId(int masterServicerId) {
		this.masterServicerId = masterServicerId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public double getOriginalIssueSize() {
		return originalIssueSize;
	}
	public void setOriginalIssueSize(double originalIssueSize) {
		this.originalIssueSize = originalIssueSize;
	}
	public int getParentAffiliateId() {
		return parentAffiliateId;
	}
	public void setParentAffiliateId(int parentAffiliateId) {
		this.parentAffiliateId = parentAffiliateId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getTrusteeId() {
		return trusteeId;
	}
	public void setTrusteeId(int trusteeId) {
		this.trusteeId = trusteeId;
	}
	private String analyst;
	private int backupServicerId;
	private int collateralManagerId;
	private int countryId;
	private boolean hasPublicEquity;
	private String identifier;
	private boolean isabsIssuer;
	private boolean isabsSponsor;
	private String issueDate;
	private String issuerName;
	private String markitEntityId;
	private int masterServicerId;
	private String notes;
	private double originalIssueSize;
	private int parentAffiliateId;
	private String state;
	private int trusteeId;	
}
