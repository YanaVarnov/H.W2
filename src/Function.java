import java.lang.Math;
public abstract class Function {

    public abstract double valueAt(double x);
    public abstract String toString();
    public abstract Function derivative();
    public double bisectionMethod(double a, double b, double epsilon){
        double left = a, right = b;
        while(right - left > epsilon){
            double mid = (left + right) / 2;
            if(valueAt(left) * valueAt(mid) > 0)
                left = mid;
            else
                right = mid;
        }
        return (left + right) / 2;
    }
    public double bisectionMethod(double a, double b){
        double epsilon = 0.00001;
        return bisectionMethod(a, b, epsilon);
    }

    public double newtonRaphsonMethod(double a, double epsilon){
        double x = a;
        Function dvt = derivative();
        while(Math.abs(valueAt(x)) >= epsilon)
            x = x - ((valueAt(x)) / (dvt.valueAt(x)));
        return x;
    }
    public double newtonRaphsonMethod(double a){
        double epsilon = 0.00001;
        return newtonRaphsonMethod(a, epsilon);
    }

    //public abstract Function taylorPolynomial(int n);

}
