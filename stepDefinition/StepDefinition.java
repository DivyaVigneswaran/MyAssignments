package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	ChromeDriver driver;
	
	@Given("browser launch")
	public void browser_launch() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
	}
	
	@Given("load URL")
	public void load_url() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@When("enter the username")
	public void enter_the_username() {
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
	}
	@When("enter the pswd")
	public void enter_the_pswd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("click submit")
	public void click_submit() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@When("click crms\\/sfa")
	public void click_crms_sfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("click leads")
	public void click_leads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("click create lead")
	public void click_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("enter the firstname")
	public void enter_the_firstname() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Divya1");
	}
	@When("enter the lastname")
	public void enter_the_lastname() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/following::input[@id='createLeadForm_lastName']")).sendKeys("Sri");
	}
	@When("enter the companyname")
	public void enter_the_companyname() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_parentPartyId']/preceding::input[@id='createLeadForm_companyName']")).sendKeys("SAMQUA");
	}
	@When("enter the profileTitle")
	public void enter_the_profile_title() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']/following::input[@id='createLeadForm_generalProfTitle']")).sendKeys("TTT");
	}
	@Then("click the submit")
	public void click_the_submit() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
