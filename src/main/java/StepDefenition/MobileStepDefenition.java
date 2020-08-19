package StepDefenition;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.flipkart.base.TestBase;
import com.flipkart.pages.MoblieSearchPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MobileStepDefenition extends TestBase {

	MoblieSearchPage page;
	Logger logger =Logger.getLogger(MobileStepDefenition.class);

	public MobileStepDefenition() {
		super();
	}

	@Given("^user opens the browser$")
	public void user_opens_the_browser() {
		intialization();
		page=new MoblieSearchPage(driver);


	}

	@When("^user enters url$")
	public void user_enters_url(){
		setUrl();
	}

	@Then("^user closes the popup$")
	public void user_closes_the_popup() {

		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		logger.info("Pop Up closed");

	}

	@Then("^validate user on home page$")
	public void validate_user_on_home_page() {
		String title = driver.getTitle();


	}

	@Given("^user search mobile product$")
	public void user_search_mobile_product(String Product) throws Throwable {
		page.searchProducts(Product);


	}

	@Then("^validate user is on mobiles page$")
	public void validate_user_is_on_mobiles_page() throws Throwable {
		driver.getTitle();
	}

	@Given("^user selects specified ram type$")
	public void user_selects_specified_ram_type(String ram) throws Throwable {
		page.ramSelection(ram);

	}

	@Then("^validate ram selection$")
	public void validate_ram_selection() throws Throwable {

	}

	@Given("^user selects specified brand type$")
	public void user_selects_specified_brand_type(String brandName) throws Throwable {
		page.brandSelection(brandName);
	}

	@Then("^validate brand selection$")
	public void validate_brand_selection() throws Throwable {
	}

	@Given("^user selects specified mobile name$")
	public void user_selects_specified_mobile_name(String mobileName) throws Throwable {
		page.selectMobile(mobileName);
	}

	@Then("^validate mobile name selection$")
	public void validate_mobile_name_selection() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^user selects compare brand and product selection$")
	public void user_selects_compare_brand_selection(String compareBrandOne,String compareProductOne) throws Throwable {
		page.compareMobile(compareBrandOne, compareProductOne);
	}


	@Then("^validate compare brand and product$")
	public void validate_compare_brand_and_product() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
