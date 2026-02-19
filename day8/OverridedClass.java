package week3.day8;

public class OverridedClass extends LearnMethodOverRiding {

	public void LearnSelenium() {
		super.LearnSelenium();
		System.out.println("Learn Selenium + API");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridedClass o = new OverridedClass();
		o.LearnSelenium();

	}

}
