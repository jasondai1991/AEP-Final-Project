package Calculator;

public class Calculator {
    private String MathExpression;

    public Calculator(String name) {
        this.MathExpression = name;
    }

    public String getName() {
        return MathExpression;
    }
}
