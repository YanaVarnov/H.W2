
public class Power extends Product{

    private int power;
    private Function function1;

    public Power(Function function1){
        this.function1 = function1;
        }

    @Override
    public double valueAt(double x) {
        return function1.valueAt(x) / function2.valueAt(x);
    }

    @Override
    public class derivative(){


    }

    @Override
    public class toString(){
    }
    }


