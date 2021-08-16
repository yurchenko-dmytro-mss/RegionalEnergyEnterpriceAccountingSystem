package accounting.ks.ua.oblenergo;

//import javax.mon

public class FinanceServiceConsumptionAccount {
	protected FinanceServiceConsumptionAccount(int fjnanceAccountId, int subscriberAccountId) {
		super();
		this.fjnanceAccountId = fjnanceAccountId;
		this.subscriberAccountId = subscriberAccountId;
	}

	public int getFjnanceAccountId() {
		return fjnanceAccountId;
	}

	public void setFjnanceAccountId(int fjnanceAccountId) {
		this.fjnanceAccountId = fjnanceAccountId;
	}

	public int getSubscriberAccountId() {
		return subscriberAccountId;
	}

	public void setSubscriberAccountId(int subscriberAccountId) {
		this.subscriberAccountId = subscriberAccountId;
	}

	private int fjnanceAccountId;
	private int subscriberAccountId;
	//private BigDecimal 
	
	private int creditEnergyConsumption;
	private int creditEnergyConsumptionCost;
	private int debitEnergyConsumption;
	
	protected void setCreditEnergyConsumption(int creditEnergyConsumption) {
		this.creditEnergyConsumption = creditEnergyConsumption;
	}
	
	protected void setCreditEnergyConsumptionCost(int tariff) {
		creditEnergyConsumptionCost = creditEnergyConsumption * tariff;
	}
	
	protected void setDebitEnergyConsumption(int moneyValue, int tariff) {
		debitEnergyConsumption = moneyValue / tariff;
	}
	
}

