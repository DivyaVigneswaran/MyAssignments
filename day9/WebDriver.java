package week4.day9;

public interface WebDriver {
	
	void findelement();
	
	void findelements();
	
	default void quit() {
		System.out.println("Quit is from WebDriver");
	}
	
	static void close() {
		
	}

}
