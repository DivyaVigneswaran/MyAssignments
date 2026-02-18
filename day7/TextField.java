package week3.day7;

public class TextField extends WebElement{
	public void submit() {
		System.out.println("Submit2");
	}

	public void getText() {
		System.out.println("Get Text2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextField text = new TextField();
		text.submit();
		text.getText();
		text.click();
		text.setText("Set");
	}

}
