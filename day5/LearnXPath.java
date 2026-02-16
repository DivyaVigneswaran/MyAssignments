package week3.day5;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

	}

}
