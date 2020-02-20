package features.multiplication.steps;

import features.common.CalculatorState;
import hu.idom.calculator.Calculator;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private Calculator calculator;

    @Before
    public void setUp(){
        CalculatorState.init();
        calculator = new Calculator();
    }

    @When("multiply {int} and {int}")
    public void multiply_and(Integer number1, Integer number2) {
        CalculatorState.result = calculator.multiply(number1,number2);
    }
}
