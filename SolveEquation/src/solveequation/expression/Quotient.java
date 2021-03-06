package solveequation.expression;

/**
 *
 * @author Admin
 */
public class Quotient extends Binary{
    public Quotient(Quantity q1, Quantity q2){
        super(q1, q2);
    }
    public double getValue(){
        try{
            double val1 = realValue(q1);
            double val2 = realValue(q2);
            return val1/val2;
        }
        catch(ArithmeticException e){
            return 1e9;
        }
    }
}
