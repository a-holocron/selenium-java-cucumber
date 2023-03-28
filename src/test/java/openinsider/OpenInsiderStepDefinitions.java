package openinsider;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenInsiderStepDefinitions{

    private BaseCucumber base;
    private WebDriver driver;

    public OpenInsiderStepDefinitions(BaseCucumber base){
        this.base= base;
        this.driver=base.getDriver();
    }


    @Given("I am on the OpenInsider page")
    public void i_am_on_the_open_insider_page() {

    }
    @When("I search for {string}")
    public void i_search_for(String ticker) {
        // Write code here that turns the phrase above into concrete actions
        WebElement tickerInput = driver.findElement(By.name("s"));
        tickerInput.sendKeys(ticker);
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
        searchButton.click();

    }
    @Then("the page title should contain {string}")
    public void the_page_title_should_contain(String expectedTitle) {
        String titlePage  = driver.getTitle();
        System.out.println(titlePage);
        Assertions.assertTrue(titlePage.contains(expectedTitle),titlePage);

    }

}
