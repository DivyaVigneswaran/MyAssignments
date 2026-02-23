package week4.day9;

public abstract class CanaraBank implements Payments {
	
	@Override
	public void cashOnDelivery() {
		System.out.println("Cash On Delivery from CanaraBank");
	}
	@Override
	public void upiPayments() {
		System.out.println("UPI Payment is From Canara Bank");
	}
	
	public void cardPayments() {
		System.out.println("Card Payment is from Canara Bank");
	}
	abstract void recordPaymentDetails();
	
	public static void main(String[] args) {
		
	}

}
