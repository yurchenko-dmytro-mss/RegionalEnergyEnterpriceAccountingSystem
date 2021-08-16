package accounting.ks.ua.oblenergo;

import java.util.Date;

public class ClientsApplicationsAccounting {
	public int getClientApplicationId() {
		return clientApplicationId;
	}
	public void setClientApplicationId(int clientApplicationId) {
		this.clientApplicationId = clientApplicationId;
	}
	public String getClientApplicationName() {
		return clientApplicationName;
	}
	public void setClientApplicationName(String clientApplicationName) {
		this.clientApplicationName = clientApplicationName;
	}
	public ClientsApplicationsAccountingType getClientApplicationAccountingType() {
		return clientApplicationAccountingType;
	}
	public void setClientApplicationAccountingType(ClientsApplicationsAccountingType clientApplicationAccountingType) {
		this.clientApplicationAccountingType = clientApplicationAccountingType;
	}
	public Date getClientApplicationData() {
		return clientApplicationData;
	}
	public void setClientApplicationData(Date clientApplicationData) {
		this.clientApplicationData = clientApplicationData;
	}
	public boolean isClientApplicationSignature() {
		return clientApplicationSignature;
	}
	public void setClientApplicationSignature(boolean clientApplicationSignature) {
		this.clientApplicationSignature = clientApplicationSignature;
	}
	protected ClientsApplicationsAccounting(int clientApplicationId, String clientApplicationName,
			ClientsApplicationsAccountingType clientApplicationAccountingType, Date clientApplicationData,
			boolean clientApplicationSignature) {
		super();
		this.clientApplicationId = clientApplicationId;
		this.clientApplicationName = clientApplicationName;
		this.clientApplicationAccountingType = clientApplicationAccountingType;
		this.clientApplicationData = clientApplicationData;
		this.clientApplicationSignature = clientApplicationSignature;
	}
	private int clientApplicationId;
	private String clientApplicationName;
	private ClientsApplicationsAccountingType clientApplicationAccountingType;
	private Date clientApplicationData; 
	private boolean clientApplicationSignature;
}
