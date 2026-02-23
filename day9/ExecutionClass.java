package week4.day9;

public class ExecutionClass extends RemoteDriver {

	@Override
	void getCurrentUrl() {
		System.out.println("Current URL from Execution Class");
		
	}
	
	//class - class :Extends
	//class - interface : implements
	//abstractclass - Interface : Implements
	//abstractclass - class : extends 
	public static void main(String[] args) {
		ExecutionClass obj = new ExecutionClass();
		obj.findelement();
		obj.findelements();
		obj.getCurrentUrl();
		obj.quit();
		
		WebDriver.close();
		
		
	}

}
