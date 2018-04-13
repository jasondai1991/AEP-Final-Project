package Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void getterShouldReturnSame(){
        String expression = "(1+2)*3";
        Calculator calculator = new Calculator(expression);
        String getRes = calculator.getName();
        assertEquals(expression,getRes);
    }

}