import java.util.List;

@FunctionalInterface
public interface MathOperation
{
    double apply(double a, double b);
    static double applyOperation(List<Double> list, MathOperation operation)
    {
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for(double value : list)
        {
            if(value > max)
            {
                max = value;
                continue;
            }
            if(value < min)
            {
                min = value;
                continue;
            }
        }
        return operation.apply(max, min);
    }
}
