package accounting.ks.ua.oblenergo;

public class MeterReadingsPerMonthDescriber {
	
	private int consumptionYear;
	private int consumptionMonth;
	private int consumptionValue;
	private boolean readingCheckedByController;
	

	protected MeterReadingsPerMonthDescriber(int consumptionYear, int consumptionMonth, int consumptionValue, boolean readingCheckedByController) {
		super();
		this.consumptionYear = consumptionYear;
		this.consumptionMonth = consumptionMonth;
		this.consumptionValue = consumptionValue;
		this.readingCheckedByController = readingCheckedByController;
	}
	
	public int getConsumptionMonth() {
		return consumptionMonth;
	}
	public void setConsumptionMonth(int consumptionMonth) {
		this.consumptionMonth = consumptionMonth;
	}
	public int getConsumptionValue() {
		return consumptionValue;
	}
	public void setConsumptionValue(int consumptionValue) {
		this.consumptionValue = consumptionValue;
	}
	public boolean isReadingCheckedByController() {
		return readingCheckedByController;
	}
	public void setReadingCheckedByController(boolean readingCheckedByController) {
		this.readingCheckedByController = readingCheckedByController;
	}
	public int getConsumptionYear() {
		return consumptionYear;
	}
	public void setConsumptionYear(int consumptionYear) {
		this.consumptionYear = consumptionYear;
	}
}
