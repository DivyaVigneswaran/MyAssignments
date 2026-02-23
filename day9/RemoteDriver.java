package week4.day9;

public abstract class RemoteDriver implements WebDriver {

	@Override
	public void findelement() {
		System.out.println("Find Element from Remote Driver");
		
	}

	@Override
	public void findelements() {
		System.out.println("Find Elements from Remote Driver");
		
	}
	
	//abstract class need atleast one abstract method.
	
	abstract void getCurrentUrl();
	
	//We can create both Implemented and Unimplemented methods - Abstract class
	public static void main(String[] args) {
		// can we create object for abstract class - no
		// RemoteDriver obj = new RemoteDriver();
	}
}
