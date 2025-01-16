import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Double> list = Arrays.asList(4.0, 2.0, -9.0, 4.0, 6.0, 0.0, -2.0, -1.0, 4.0);
        System.out.println(list);
        System.out.println(MathOperation.applyOperation(list, (double a, double b) -> a + b));
        System.out.println(MathOperation.applyOperation(list, (double a, double b) -> a - b));
        System.out.println(MathOperation.applyOperation(list, (double a, double b) -> a * b));
        System.out.println(MathOperation.applyOperation(list, (double a, double b) -> a / b));
        System.out.println(MathOperation.applyOperation(list, (double a, double b) -> a % b));
    }
}