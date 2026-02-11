package week2.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
		// TODO Auto-generated method stub
		System.out.println("Browser launched successfully");
		return browserName;

	}
	public void loadUrl() {
		// TODO Auto-generated method stub
		System.out.println("Application url loaded successfully");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser obj = new Browser();
		String launchBrowser = obj.launchBrowser("Chrome");
		System.out.println(launchBrowser);
		obj.loadUrl();
		
		
	}

}
