package accounting.ks.ua.oblenergo;

import java.util.Date;

public class EnterpriseContractsAccounting {
	protected EnterpriseContractsAccounting(int enterpriseContractId, String enterpriseContractName,
			Date enterpriseContractData, boolean clientContractSignature, boolean enterpriseContractSignature) {
		super();
		this.enterpriseContractId = enterpriseContractId;
		this.enterpriseContractName = enterpriseContractName;
		this.enterpriseContractData = enterpriseContractData;
		this.clientContractSignature = clientContractSignature;
		this.enterpriseContractSignature = enterpriseContractSignature;
	}
	public int getEnterpriseContractId() {
		return enterpriseContractId;
	}
	public void setEnterpriseContractId(int enterpriseContractId) {
		this.enterpriseContractId = enterpriseContractId;
	}
	public String getEnterpriseContractName() {
		return enterpriseContractName;
	}
	public void setEnterpriseContractName(String enterpriseContractName) {
		this.enterpriseContractName = enterpriseContractName;
	}
	public Date getEnterpriseContractData() {
		return enterpriseContractData;
	}
	public void setEnterpriseContractData(Date enterpriseContractData) {
		this.enterpriseContractData = enterpriseContractData;
	}
	public boolean isClientContractSignature() {
		return clientContractSignature;
	}
	public void setClientContractSignature(boolean clientContractSignature) {
		this.clientContractSignature = clientContractSignature;
	}
	public boolean isEnterpriseContractSignature() {
		return enterpriseContractSignature;
	}
	public void setEnterpriseContractSignature(boolean enterpriseContractSignature) {
		this.enterpriseContractSignature = enterpriseContractSignature;
	}
	private int enterpriseContractId;
	private String enterpriseContractName;
	private Date enterpriseContractData;
	private boolean clientContractSignature;
	private boolean enterpriseContractSignature;
}
