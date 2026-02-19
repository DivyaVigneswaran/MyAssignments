package week3.day8;

public class LoginPage extends BasePage{
	
	@Override
	public void performCommonTasks() {
		// TODO Auto-generated method stub
		super.performCommonTasks();
		System.out.println("Perform the Common");
	}

	public static void main(String[] args) {
		LoginPage LP = new LoginPage();
		LP.performCommonTasks();

	}

}
