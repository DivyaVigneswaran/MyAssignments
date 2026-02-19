package week3.day8;

public class BasePage {
	
	public void findElement() {
		System.out.println("Find Element by XPATH");

	}
	public void clickElement() {
		System.out.println("Click the ELement");

	}
	public void enterText() {
		System.out.println("Enter the Text");

	}
	public void performCommonTasks() {
		System.out.println("Perform the Common Tasks");

	}
	public static void main(String[] args) {
		BasePage BP = new BasePage();
		BP.findElement();
		BP.clickElement();
		BP.enterText();
		BP.performCommonTasks();

	}

}
