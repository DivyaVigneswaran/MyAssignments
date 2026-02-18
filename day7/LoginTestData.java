package week3.day7;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Username is Divya");

	}

	public void enterPassword() {
		System.out.println("Password is Summer$012025");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();
	}

}
