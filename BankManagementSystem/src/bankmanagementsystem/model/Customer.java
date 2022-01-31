package bankmanagementsystem.model;

public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private String customerAcNo;
	private float accountbalance;
	private double customerPhn;
	
	
	public float getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(float accountbalance) {
		this.accountbalance = accountbalance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerAcNo() {
		return customerAcNo;
	}
	public void setCustomerAcNo(String customerAcNo) {
		this.customerAcNo = customerAcNo;
	}
	public double getCustomerPhn() {
		return customerPhn;
	}
	public void setCustomerPhn(double customerPhn) {
		this.customerPhn = customerPhn;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName) {
		super();
		
		this.customerName = customerName;
		
	}
	
}