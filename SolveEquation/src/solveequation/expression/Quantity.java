package solveequation.expression;

/**
 *
 * @author Admin
 */
public abstract class Quantity {
    public abstract double getValue();
    public static double realValue(Quantity q){
        return q != null ? q.getValue() : Double.NaN;
    }
}
