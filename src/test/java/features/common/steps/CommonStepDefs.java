package features.common.steps;

import actions.CalculateSumOfTwoNumbersAction;
import features.common.CalculatorState;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pagobjects.CalculatorHomePage;

import static org.junit.Assert.assertEquals;

public class CommonStepDefs {
    @Given("open calculator")
    public void open_calculator() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fuzesizs\\dev\\tools\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/index.html");
        PageFactory.initElements(driver, CalculatorHomePage.class);
        CalculateSumOfTwoNumbersAction.execute(driver,10,20);
    }

    @Then("the result is {int}")
    public void the_result_is(Integer number) {
        assertEquals(CalculatorState.result,number);
    }
}
