package strategy.zadanie;

public class Calculator {

    public static double calculate(double a, double b, String operator) {
        double result = 0;

        CalculatorContext context = new CalculatorContext();
        if ("add".equals(operator)) {
            context.setOperation(new AddCalcualtion());
            result = context.calculate(a,b);
        } else if ("multiply".equals(operator)) {
            context.setOperation(new MultiplyCalcualtion());
            result = context.calculate(a,b);
        } else if ("divide".equals(operator)) {
            context.setOperation(new DivCalcualtion());
            result = context.calculate(a,b);
        } else if ("subtract".equals(operator)) {
            context.setOperation(new SubCalcuation());
            result = context.calculate(a,b);
        }
        return result;
    }

    public static double calculate(double a, double b, CalculatorOperation operation) {
        CalculatorContext context = new CalculatorContext(operation);
        return  context.calculate(a,b);
    }


}
