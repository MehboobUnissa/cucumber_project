package steps;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.BrowserManager;
import utils.QAProps;


public class stepsDefinition {

    private WebDriver driver;
    HomePage homePage;

    String url;
    public stepsDefinition(BrowserManager browserManager){
        this.driver=browserManager.getDriver();
    }
    @Given("is able to navigates to the homepage")
    public void is_able_to_navigates_to_the_homepage() {
        url = QAProps.getValue("url");
        driver.get(url);
    }

    @Then("the user enter the product name")
    public void the_user_enter_the_product_name() {

        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys("mobiles");
        homePage.getSearchBox().sendKeys(Keys.ENTER);
    }

    @When("the products results should be displayed")
    public void the_products_results_should_be_displayed() {
        String text =homePage.getSearchResult()
        .getText();
        Assert.assertEquals(text,"\"mobiles\"");

    }

   

    @Given("User is logged in")
    public void userIsLoggedIn() {

    }

    @And("user enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
    }

    @Then("user navigates to login page")
    public void userNavigatesToLoginPage() {
        
    }

    @Given("user is on HomePage")
    public void userIsOnHomePage() {
    }

    @Then("message displayed successfully logged in")
    public void messageDisplayedSuccessfullyLoggedIn() {

    }
}