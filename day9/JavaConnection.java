package week4.day9;

public class JavaConnection implements DatabseConnection {

	@Override
	public void connect() {
		System.out.println("Execute the connect from Java Connection");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Execute the disconnect from Java Connection");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the Update from Java Connection");
		
	}

	public static void main(String[] args) {

	//Create Object for the class and call the interface methods
	JavaConnection obj1 = new JavaConnection();
	obj1.connect();
	obj1.disconnect();
	obj1.executeUpdate();
	
	}
}
