package week3.day7;

public class RadioButton extends Button {
	public void selectRadioButton() {
		System.out.println("Select the Radio Button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton R = new RadioButton();
		R.selectRadioButton();
		R.submit();
		R.getText();
		R.click();
		R.setText(null);
	}

}
