package bg.jwd.bank.dto;

public class BankOperation {
	private String client;
	private String operations;
	private Double amount;
	private String currency;
	
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	
	public String getOperations() {
		return operations;
	}
	
	public void setOperations(String operations) {
		this.operations = operations;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
