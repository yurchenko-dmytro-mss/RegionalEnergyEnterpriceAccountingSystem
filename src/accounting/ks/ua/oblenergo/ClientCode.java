package accounting.ks.ua.oblenergo;

import java.math.*;

public class ClientCode {
	
	//DatabaseDAC databaseDAC = new DatabaseDAC();
	
	SubscribersMeterReadingsAccounting c1 = new SubscribersMeterReadingsAccounting(0,0,null);
	BookkeeperServiceConsumptionAcounting b1 = new BookkeeperServiceConsumptionAcounting((int) (Math.random() * 10), (int) (Math.random() * 10));
	
	
	
	private void clientCodeExe() {
		
	c1.energyConsumptionData.add(0, new MeterReadingsPerMonthDescriber(2020, 1 , 100, false));
	c1.energyConsumptionData.add(1, new MeterReadingsPerMonthDescriber(2020, 2,  200, true));
	c1.energyConsumptionData.add(2, new MeterReadingsPerMonthDescriber(2020, 3 , 300, false));
    b1.planCalculation();
    
    
    //databaseDAC.runDML();
	}
}
