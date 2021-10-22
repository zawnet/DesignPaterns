package strategy.zadanie;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(1, 2,new AddCalcualtion()));
        System.out.println(calculator.calculate(1, 2,new SubCalcuation()));
        System.out.println(calculator.calculate(1, 2,new MultiplyCalcualtion()));
        System.out.println(calculator.calculate(1, 2,new DivCalcualtion()));
    }
}
