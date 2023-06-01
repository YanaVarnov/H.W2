import java.util.function.Function;

public class MultiSum extends Function{
    private Function []functions;
    //private Function multiFunction;
    private int numOfFunc;

    public MultiSum(Function...functions){
        int i=0;
        while(functions[i]!=null) {
            this.functions[i] = functions[i];
            i++;
        }
        numOfFunc = i;
        }

    @Override
    public double valueAt(double x) {
        double sum = 0;
        for (int i = 0; i < numOfFunc; i++) {
            sum += functions[i].valueAt(x);
            return sum;
        }
    }

    @Override
    public Polynomial derivative(){
        return function1.derivative() + function2.derivaive();
    }

    @Override
    public String toString(){
        int i;
        for(i=0;i<numOfFunc-1;i++){

        }

    }


}
