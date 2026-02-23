package week4.day9;

public class JavaConnection1  extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Execute connect in JavaConnection1");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Execute disconnect in JavaConnection1");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute ExecuteUpdate in JavaConnection1");
		
	}

	@Override
	void executeQuery() {
		System.out.println("Execute ExecuteQuery in JavaConnection1");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	JavaConnection1 obj2= new JavaConnection1();
	obj2.connect();
	obj2.disconnect();
	obj2.executeUpdate();
	obj2.executeQuery();
	}
}
