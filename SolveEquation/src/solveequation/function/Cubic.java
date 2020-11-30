package solveequation.function;

/**
 *
 * @author Admin
 */
public class Cubic implements Equation{
    private double a, b, c, d, sol1, sol2, sol3;
    private Message message;

    public Cubic(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getSol1() {
        return sol1;
    }

    public void setSol1(double sol1) {
        this.sol1 = sol1;
    }

    public double getSol2() {
        return sol2;
    }

    public void setSol2(double sol2) {
        this.sol2 = sol2;
    }

    public double getSol3() {
        return sol3;
    }

    public void setSol3(double sol3) {
        this.sol3 = sol3;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    
    
    
    
    public void solve(){
        if(a == 0){
           Quadratic quad = new Quadratic(b, c, d);
           quad.solve();
           message = quad.getMessage();
           return;
        }
        else{
            double delta = b*b - 3*a*c;
            double k = (9*a*b*c - 2*b*b*b - 27*a*a*d)/2/Math.sqrt(Math.abs(delta)*delta*delta);
            System.out.println(k);
            if(delta > 0){
                if(Math.abs(k) <= 1){
                    sol1 = (2*Math.sqrt(delta)*Math.cos(Math.acos(k)/3)-b)/3/a;
                    sol1 = Math.round(sol1 * 1000000000.0) / 1000000000.0;
                    sol2 = (2*Math.sqrt(delta)*Math.cos(Math.acos(k)/3 - 2*Math.PI/3)-b)/3/a;
                    sol2 = Math.round(sol2 * 1000000000.0) / 1000000000.0;
                    sol3 = (2*Math.sqrt(delta)*Math.cos(Math.acos(k)/3 + 2*Math.PI/3)+b)/3/a;
                    sol3 = Math.round(sol3 * 1000000000.0) / 1000000000.0;
                    message = new Message("\nx1 = " + sol1 + "\nx2 = " + sol2 + "\nx3 = " + sol3);
                }
                else{
                    sol1 = Math.sqrt(delta)*Math.abs(k)/3/a/k*(Math.cbrt((Math.abs(k) + Math.sqrt(k*k-1))) 
                            + Math.cbrt((Math.abs(k) - Math.sqrt(k*k-1)))) - b/3/a;
                    message = new Message("\nx = " + sol1);
                }
            }
            else if(delta == 0){
                if(b*b*b-27*a*a*d == 0){
                    sol1 = -b/3/a;
                    
                    sol1 = Math.round(sol1 * 1000000000.0) / 1000000000.0;
                    message = new Message("\nx = " + sol1);
                }
                else{
                    sol1 = (-b+Math.pow(b*b*b-27*a*a*d, 1/3))/3/a;                    
                    sol1 = Math.round(sol1 * 1000000000.0) / 1000000000.0;
                    message = new Message("\nx = " + sol1);
                }
            }   
            else{
                sol1 = Math.sqrt(-delta)/3/a*(Math.cbrt((k + Math.sqrt(k*k+1))) 
                            + Math.cbrt((k - Math.sqrt(k*k+1)))) - b/3/a;
                sol1 = Math.round(sol1 * 1000000000.0) / 1000000000.0;
                message = new Message("\nx = " + sol1);
            }
        }
    }
}
