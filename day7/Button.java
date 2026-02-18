package week3.day7;

public class Button extends WebElement {

	public void submit() {
		System.out.println("Submit1");
	}

	public void getText() {
		System.out.println("Get Text1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button B = new Button();
		B.click();
		B.setText("Test");
		B.submit();
		B.getText();

	}

}
