package accounting.ks.ua.oblenergo;

import java.util.Calendar;

public class SubscribersServiceConsumptionAccounting {
	protected SubscribersServiceConsumptionAccounting(int subscriberAccountId, int subscriberId, int enterpriseContractId,
			int enterpriseLongServiceId, Calendar serviceConsumptionStart, Calendar serviceConsumptionFinish) {
		super();
		this.subscriberAccountId = subscriberAccountId;
		this.subscriberId = subscriberId;
		this.enterpriseContractId = enterpriseContractId;
		this.enterpriseLongServiceId = enterpriseLongServiceId;
		this.serviceConsumptionStart = serviceConsumptionStart;
		this.serviceConsumptionFinish = serviceConsumptionFinish;
	}
	public int getSubscriberAccountId() {
		return subscriberAccountId;
	}
	public void setSubscriberAccountId(int subscriberAccountId) {
		this.subscriberAccountId = subscriberAccountId;
	}
	public int getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}
	public int getEnterpriseContractId() {
		return enterpriseContractId;
	}
	public void setEnterpriseContractId(int enterpriseContractId) {
		this.enterpriseContractId = enterpriseContractId;
	}
	public int getEnterpriseLongServiceId() {
		return enterpriseLongServiceId;
	}
	public void setEnterpriseLongServiceId(int enterpriseLongServiceId) {
		this.enterpriseLongServiceId = enterpriseLongServiceId;
	}
	public Calendar getServiceConsumptionStart() {
		return serviceConsumptionStart;
	}
	public void setServiceConsumptionStart(Calendar serviceConsumptionStart) {
		this.serviceConsumptionStart = serviceConsumptionStart;
	}
	public Calendar getServiceConsumptionFinish() {
		return serviceConsumptionFinish;
	}
	public void setServiceConsumptionFinish(Calendar serviceConsumptionFinish) {
		this.serviceConsumptionFinish = serviceConsumptionFinish;
	}
	private int subscriberAccountId;
	private int subscriberId;
	private int enterpriseContractId;
	private int enterpriseLongServiceId;
	private Calendar serviceConsumptionStart;
	private Calendar serviceConsumptionFinish;
	
}

