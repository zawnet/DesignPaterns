package strategy.zadanie;

public class CalculatorContext {

    private CalculatorOperation operation;

    public CalculatorContext() {
    }

    public CalculatorContext(CalculatorOperation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b){
        return  operation.calculate(a,b);
    }

    public void setOperation(CalculatorOperation operation) {
        this.operation = operation;
    }
}
