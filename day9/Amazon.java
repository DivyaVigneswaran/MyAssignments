package week4.day9;

public class Amazon extends CanaraBank {

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking from Amazon");
		
	}

	@Override
	void recordPaymentDetails() {
		System.out.println("RecordPayment Details from Amazon");
		
	}

		public static void main(String[] args) {
			Amazon amazon = new Amazon();
			amazon.cardPayments();
			amazon.cashOnDelivery();
			amazon.upiPayments();
			amazon.internetBanking();
			amazon.recordPaymentDetails();
		}
}
