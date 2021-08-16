package accounting.ks.ua.oblenergo;


import java.math.BigDecimal;


public class SubscribersMoneyAccount {
	protected SubscribersMoneyAccount(int subscriberAccountId, int subscriberId) {
		super();
		this.subscriberAccountId = subscriberAccountId;
		this.subscriberId = subscriberId;
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

	private int subscriberAccountId;
	private int subscriberId;
	
	private int subscriberMoneyValue; //BigDecimal DEPRECATED
	
	private void subscriberAccountRefill(int moneyValue) {
		subscriberMoneyValue += moneyValue;
	}
	
	private void subscriberAccountSpend(int moneyValue) {
		subscriberMoneyValue -= moneyValue;
	}
}
