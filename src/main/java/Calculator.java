public class Calculator {
    public int calculate(int a, int b, Calculable calculable) {
        return calculable.calculate(a, b);
    }
}
