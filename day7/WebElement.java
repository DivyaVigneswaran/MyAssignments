package week3.day7;

public class WebElement {

	public void click() {

		System.out.println("Click the Button");

	}

	public void setText(String text){

		System.out.println("Test");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElement BC = new WebElement();
		BC.click();
		BC.setText("Test");

	}

}
