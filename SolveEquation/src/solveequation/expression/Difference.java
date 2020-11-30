package solveequation.expression;

/**
 *
 * @author Admin
 */
public class Difference extends Binary{
    public Difference(Quantity q1, Quantity q2){
        super(q1, q2);
    }
    public double getValue(){
        double val1 = realValue(q1);
        double val2 = realValue(q2);
        return val1 - val2;
    }
}
