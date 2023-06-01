
public class Difference extends Function {
    private Function function1;
    private Function function2;


    public Difference(Function function1, Function function2) {
        this.function1 = function1;
        this.function2 = function2;
    }
    @Override
    public double valueAt(double x) {
        return function1.valueAt(x) - function2.valueAt(x);
    }

    @Override
    public class derivative(){
        function1.derivative() - function2.derivaive();
    }

    @Override
    public String toString(){
        return function1.toString() - function2.toString();



    }
}


