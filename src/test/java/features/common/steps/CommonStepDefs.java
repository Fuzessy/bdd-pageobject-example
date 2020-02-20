package features.common.steps;

import features.common.CalculatorState;
import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

public class CommonStepDefs {
    @Given("open calculator")
    public void open_calculator() {

    }

    @Then("the result is {int}")
    public void the_result_is(Integer number) {
        assertEquals(CalculatorState.result,number);
    }
}
