package accounting.ks.ua.oblenergo;

import java.util.Date;

public class EnterpriseObligationsAccounting {
	protected EnterpriseObligationsAccounting(int enterpriceOligationId, int enterpriceOligationName,
			EnterpriseObligationsType enterpriseObligationType, Date enterpriseObligationData) {
		super();
		this.enterpriceOligationId = enterpriceOligationId;
		this.enterpriceOligationName = enterpriceOligationName;
		this.enterpriseObligationType = enterpriseObligationType;
		this.enterpriseObligationData = enterpriseObligationData;
	}
	public int getEnterpriceOligationId() {
		return enterpriceOligationId;
	}
	public void setEnterpriceOligationId(int enterpriceOligationId) {
		this.enterpriceOligationId = enterpriceOligationId;
	}
	public int getEnterpriceOligationName() {
		return enterpriceOligationName;
	}
	public void setEnterpriceOligationName(int enterpriceOligationName) {
		this.enterpriceOligationName = enterpriceOligationName;
	}
	public EnterpriseObligationsType getEnterpriseObligationType() {
		return enterpriseObligationType;
	}
	public void setEnterpriseObligationType(EnterpriseObligationsType enterpriseObligationType) {
		this.enterpriseObligationType = enterpriseObligationType;
	}
	public Date getEnterpriseObligationData() {
		return enterpriseObligationData;
	}
	public void setEnterpriseObligationData(Date enterpriseObligationData) {
		this.enterpriseObligationData = enterpriseObligationData;
	}
	private int enterpriceOligationId;
	private int enterpriceOligationName;
	private EnterpriseObligationsType enterpriseObligationType;
	private Date enterpriseObligationData;
}
