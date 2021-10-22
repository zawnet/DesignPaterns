package strategy.zadanie;

public class AddCalcualtion implements CalculatorOperation{
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
