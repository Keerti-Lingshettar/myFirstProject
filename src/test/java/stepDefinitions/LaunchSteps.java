package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;

public class LaunchSteps {
	public static WebDriver driver =new ChromeDriver();
	@Given("Launch chrome")
	public void launch_chrome() {
		System.out.println("Welcome to chrome\n");
	}
	
	@When("I enter Workjam")
	public void i_enter_workjam() {
		driver.get("https://www.workjam.com/");
		System.out.println(driver.getTitle());
		
	}
	
	@Then("I should be redirected to Why Workjam")
	public void i_should_be_redirected_to_why_workjam() {
		driver.findElement(By.xpath("//*[text()='Why WorkJam']")).click();
		driver.quit();
	}
		
	


}
