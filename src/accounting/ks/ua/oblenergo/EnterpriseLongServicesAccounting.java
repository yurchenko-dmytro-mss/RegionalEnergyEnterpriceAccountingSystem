package accounting.ks.ua.oblenergo;

import java.util.Date;

public class EnterpriseLongServicesAccounting extends EnterpriseProductsAccounting{
	protected EnterpriseLongServicesAccounting(int enterpriseLongServiceId, String enterpriseLongServiceName,
			Date enterpriseLongServiceData, int enterpriseLongServiceTimeLimit) {
		super(0, "");
		this.enterpriseLongServiceId = enterpriseLongServiceId;
		this.enterpriseLongServiceName = enterpriseLongServiceName;
		this.enterpriseLongServiceData = enterpriseLongServiceData;
		this.enterpriseLongServiceTimeLimit = enterpriseLongServiceTimeLimit;
	}
	public int getEnterpriseLongServiceId() {
		return enterpriseLongServiceId;
	}
	public void setEnterpriseLongServiceId(int enterpriseLongServiceId) {
		this.enterpriseLongServiceId = enterpriseLongServiceId;
	}
	public String getEnterpriseLongServiceName() {
		return enterpriseLongServiceName;
	}
	public void setEnterpriseLongServiceName(String enterpriseLongServiceName) {
		this.enterpriseLongServiceName = enterpriseLongServiceName;
	}
	public Date getEnterpriseLongServiceData() {
		return enterpriseLongServiceData;
	}
	public void setEnterpriseLongServiceData(Date enterpriseLongServiceData) {
		this.enterpriseLongServiceData = enterpriseLongServiceData;
	}
	public int getEnterpriseLongServiceTimeLimit() {
		return enterpriseLongServiceTimeLimit;
	}
	public void setEnterpriseLongServiceTimeLimit(int enterpriseLongServiceTimeLimit) {
		this.enterpriseLongServiceTimeLimit = enterpriseLongServiceTimeLimit;
	}
	private int enterpriseLongServiceId;
	private String enterpriseLongServiceName; 
	private Date enterpriseLongServiceData;
	private int enterpriseLongServiceTimeLimit;
}
