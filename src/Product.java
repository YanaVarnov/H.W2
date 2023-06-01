public class Product extends Function {
    protected Function function1;
    protected Function function2;

    public Product(Function function1,Function function2){
        this.function1 = function1;
        this.function2 = function2;
    }

    @Override
    public double valueAt(double x) {
        return function1.valueAt(x) * function2.valueAt(x);
    }

    @Override
    public class derivative(){

    }

    @Override
    public class toString(){

    }
}
