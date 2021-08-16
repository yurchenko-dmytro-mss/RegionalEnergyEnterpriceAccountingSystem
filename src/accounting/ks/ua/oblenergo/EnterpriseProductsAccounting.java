package accounting.ks.ua.oblenergo;

public class EnterpriseProductsAccounting {
	protected EnterpriseProductsAccounting(int enterpriseProductId, String enterpriseProductName) {
		super();
		this.enterpriseProductId = enterpriseProductId;
		this.enterpriseProductName = enterpriseProductName;
	}
	public int getEnterpriseProductId() {
		return enterpriseProductId;
	}
	public void setEnterpriseProductId(int enterpriseProductId) {
		this.enterpriseProductId = enterpriseProductId;
	}
	public String getEnterpriseProductName() {
		return enterpriseProductName;
	}
	public void setEnterpriseProductName(String enterpriseProductName) {
		this.enterpriseProductName = enterpriseProductName;
	}
	private int enterpriseProductId;
	private String enterpriseProductName; 
}
