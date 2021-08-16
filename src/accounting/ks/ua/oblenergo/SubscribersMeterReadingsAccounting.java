package accounting.ks.ua.oblenergo;

import java.util.List;
import java.util.ArrayList;

public class SubscribersMeterReadingsAccounting {
	protected SubscribersMeterReadingsAccounting(int subscriberAccountId, int electricityMeterId,
			List<MeterReadingsPerMonthDescriber> energyConsumptionData) {
		super();
		this.subscriberAccountId = subscriberAccountId;
		this.electricityMeterId = electricityMeterId;
		this.energyConsumptionData = energyConsumptionData;
	}

	public int getSubscriberAccountId() {
		return subscriberAccountId;
	}

	public void setSubscriberAccountId(int subscriberAccountId) {
		this.subscriberAccountId = subscriberAccountId;
	}

	public int getElectricityMeterId() {
		return electricityMeterId;
	}

	public void setElectricityMeterId(int electricityMeterId) {
		this.electricityMeterId = electricityMeterId;
	}

	public List<MeterReadingsPerMonthDescriber> getEnergyConsumptionData() {
		return energyConsumptionData;
	}

	public void setEnergyConsumptionData(List<MeterReadingsPerMonthDescriber> energyConsumptionData) {
		this.energyConsumptionData = energyConsumptionData;
	}

	private int subscriberAccountId; 
	private int electricityMeterId;

	protected List <MeterReadingsPerMonthDescriber> energyConsumptionData = new ArrayList <MeterReadingsPerMonthDescriber> ();
	
}
