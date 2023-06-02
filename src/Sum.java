
public class Sum extends MultiSum {
    private Function function1;
    private Function function2;

    public Sum(Function function1, Function function2) {
        super(function1,function2);
    }

    @Override
    public double valueAt(double x) {
        return function1.valueAt(x) + function2.valueAt(x);
    }

    @Override
    public MultiSum derivative(){
        return super.derivative();
    }

    @Override
    public String toString(){
       return super.toString();
    }

}
