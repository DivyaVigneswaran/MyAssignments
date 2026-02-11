package week2.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser object = new Browser();
		String launchBrowser=object.launchBrowser("Edge");
		System.out.println(launchBrowser);
		object.loadUrl();

	}

}
