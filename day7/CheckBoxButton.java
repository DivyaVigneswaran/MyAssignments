package week3.day7;

public class CheckBoxButton extends Button {

	public void clickCheckButton()
	{
		System.out.println("Click the Check Button");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxButton C = new CheckBoxButton();
		C.clickCheckButton();
		C.submit();
		C.getText();
		C.click();
		C.setText(null);

	}

}
