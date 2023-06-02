
public class Quotient extends Function {
    private Function function1;
    private Function function2;

    public Quotient(Function function1,Function function2){
        this.function1 = function1;
        this.function2 = function2;
    }

    @Override
    public double valueAt(double x) {
        return function1.valueAt(x) / function2.valueAt(x);
    }

    @Override
    public Quotient derivative(){
        int i;
        Quotient dvtQvt = new Quotient(this.function1.derivative(),this.function2.derivative());
        return dvtQvt;
    }

    @Override
    public String toString() {
        String str = "(" + this.function1.toString() + " / " + this.function2.toString() + ")";
        return str;
    }
}
