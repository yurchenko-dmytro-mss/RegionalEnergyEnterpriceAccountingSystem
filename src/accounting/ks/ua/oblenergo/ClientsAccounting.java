package accounting.ks.ua.oblenergo;



public class ClientsAccounting implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int clientId;
	private String clientName;
	private String clientInfo;
	
	public ClientsAccounting () {
	   }

	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientInfo() {
		return clientInfo;
	}
	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
	}

	}


