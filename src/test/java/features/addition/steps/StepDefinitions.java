package features.addition.steps;

import features.common.CalculatorState;
import hu.idom.calculator.Calculator;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @When("add {int} and {int}")
    public void add_and(Integer number1, Integer number2) {
        CalculatorState.result = calculator.add(number1,number2);
    }
}
