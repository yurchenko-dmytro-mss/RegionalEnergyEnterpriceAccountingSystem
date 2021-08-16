package accounting.ks.ua.oblenergo;

import java.util.Calendar;

public class BookkeeperServiceConsumptionAcounting {
	public int getBookkeeperAccountId() {
		return bookkeeperAccountId;
	}

	public void setBookkeeperAccountId(int bookkeeperAccountId) {
		this.bookkeeperAccountId = bookkeeperAccountId;
	}

	public int getSubscriberAccountId() {
		return subscriberAccountId;
	}

	public void setSubscriberAccountId(int subscriberAccountId) {
		this.subscriberAccountId = subscriberAccountId;
	}

	protected BookkeeperServiceConsumptionAcounting(int bookkeeperAccountId, int subscriberAccountId) {
		super();
		this.bookkeeperAccountId = bookkeeperAccountId;
		this.subscriberAccountId = subscriberAccountId;
	}

	private int bookkeeperAccountId;
	private int subscriberAccountId;
	
	private int getConsumptionValueByPlanDebt(SubscribersMeterReadingsAccounting subscribersMeterReading, int countedEnergy) {
		return countedEnergy;
	}
	
	private int getConsumptionValueByPlanCredit(Object financialReference, int payedEnergy) {
		return payedEnergy;
	}
	
	private int debitEnergyConsumption = 0;
	private int creditEnergyConsumption = 0;
	

	private void debitConsumptionEvent(int consumptionValue) {
		debitEnergyConsumption += consumptionValue;
	}
	
	private void creditConsumptionEvent(int consumptionValue) {
		creditEnergyConsumption += consumptionValue;
	}
	
	protected void planCalculation() {
		debitConsumptionEvent(getConsumptionValueByPlanCredit(null, 10));
		creditConsumptionEvent(getConsumptionValueByPlanDebt(null, 20));
	}
	
	protected int getCreditEnergyConsumption() {
		return creditEnergyConsumption;
	}

	protected void setCreditEnergyConsumption(int debitEnergyConsumption) {
		creditEnergyConsumption -= debitEnergyConsumption;
	}

}
 