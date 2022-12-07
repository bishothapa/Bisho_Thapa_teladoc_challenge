package steps;

import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TelaDoc1;

public class AddandDelete  extends TelaDoc1 {
 

//	private static final By ClickonRoleDropdown = null;

	@Given("^User has to add a user and validate$")
	public void user_has_to_add_a_user_and_validate() {
		initDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
	     
	}

	@When("^User click on the Add User Button$")
	public void user_click_on_the_Add_User_Button() throws Throwable {
		By ClickOnAddUser = By.xpath("/html/body/table/thead/tr[2]/td/button");
		Thread.sleep(3000);
		driver.findElement(ClickOnAddUser).click();
		Thread.sleep(3000);
		}
	     

	@Then("^the Add User button pops up$")
	public void the_Add_User_button_pops_up() throws Throwable {
		By clickonFirstName = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input");
		driver.findElement(clickonFirstName).sendKeys("Chris");
		By ClickonLastName= By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input");
		driver.findElement(ClickonLastName).sendKeys("white");
		By ClickonUserName= By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input");
		driver.findElement(ClickonUserName).sendKeys("christian");
		By ClickonPassword= By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input");
		driver.findElement(ClickonPassword).sendKeys("christian123");
		By ClickonCustomerRadioButton= By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]/input");
		driver.findElement(ClickonCustomerRadioButton).click();
//		System.out.println("validate the drop down");
		
		By ClickonRoleDropdown = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[4]");
		driver.findElement(ClickonRoleDropdown).click(); 
		By ClickonEmail= By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input");
		driver.findElement(ClickonEmail).sendKeys("christian123@admin.com");
		By ClickonCellPhone= By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input");
		driver.findElement(ClickonCellPhone).sendKeys("6145123653");
		By ClickonSaveButton = By.xpath("/html/body/div[3]/div[3]/button[2]");
		driver.findElement(ClickonSaveButton).click();

//	    
	}

	@Given("^User should be able to Delete novak and validate$")
	public void user_should_be_able_to_Delete_novak_and_validate() throws Throwable {
		By Clickondeletebutton = By.xpath("/html/body/table/tbody/tr[3]/td[11]/button/i");
	  driver.findElement(Clickondeletebutton).click();
	  By ClickonOkButton = By.xpath("/html/body/div[3]/div[3]/button[2]");
		driver.findElement(ClickonOkButton).click();
		
	    
	}

	@When("^User Delete novak an validate$")
	public void user_Delete_novak_an_validate() throws Throwable {
		

	}

	@Then("^the novak should be deleted and empty that place$")
	public void the_novak_should_be_deleted_and_empty_that_place() throws Throwable {
	     
	}
	@After
	public void TearDown() {
		driver.close();
		driver.quit();

	}
}
