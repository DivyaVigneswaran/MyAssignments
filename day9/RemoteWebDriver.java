package week4.day9;

public class RemoteWebDriver implements WebDriver{


	@Override
	public void findelement() {
		
	}

	@Override
	public void findelements() {
		
	}
	
	public static void main(String[] args) {
		
		RemoteWebDriver obj = new RemoteWebDriver();
		obj.findelement();
		obj.findelements();
		obj.quit();
		WebDriver.close();
		
	}

}
