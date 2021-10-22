package strategy.zadanie;

public class SubCalcuation implements CalculatorOperation{
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
