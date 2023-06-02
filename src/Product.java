
public class Product extends MultiProduct {
    private Function function1;
    private Function function2;

    public Product(Function function1,Function function2){
        this.function1 = function1;
        this.function2 = function2;
    }

    @Override
    public double valueAt(double x) {
        return function1.valueAt(x) * function2.valueAt(x);
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
