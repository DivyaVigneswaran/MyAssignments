package week3.day8;

public class LearnMethodOverLoading {

	// Method 1: Two parameters
	public void reportStep(String msg, String status) {
		System.out.println("Message: " + msg);
		System.out.println("Status: " + status);
	}

	// Method 2: Three parameters (Overloaded Method)
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("Message: " + msg);
		System.out.println("Status: " + status);
		System.out.println("Snap: " + snap);

	}

	// Main method
	public static void main(String[] args) {

		// Create object of the class
		LearnMethodOverLoading obj = new LearnMethodOverLoading();

		// Call method with 2 parameters
		obj.reportStep("Login successful", "PASS");

		// Call method with 3 parameters
		obj.reportStep("Payment failed", "FAIL", true);
	}
}
