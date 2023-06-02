
public class Power extends MultiProduct{

    private int power;
    private Function[] functions;

    public Power(int power,Function...functions) {
        int i = 0;
        this.power = power;
        for (i = 0; i < this.power; i++) {
            this.functions[i] = functions[i];
        }
    }

    @Override
    public double valueAt(double x) {
       return super.valueAt(x);
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


