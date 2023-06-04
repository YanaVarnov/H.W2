
public class Power extends Function{

    private int power;
    private Function function1;
    private Function [] funcs;

    public Power(Function function1, int power) {
        int i=0;
        this.power = power;
        for(i=0;i<this.power;i++){
            this.funcs[i] = this.function1;
        }
    }

    @Override
    public double valueAt(double x){
        double value = 1;
        for(int i = 0; i < this.power; i++)
            value *= this.funcs[i].valueAt(x);
        return value;
    }
    @Override
    public Function derivative(){
        int i=0;
        if(this.power > 1){
            Function[] devFunc = new Function[3];
            devFunc[0] = new Constant(this.power);
            devFunc[1] = this.function1.derivative();
            devFunc[2] = this.function1;
            MultiProduct dvt = new MultiProduct(devFunc);
            return dvt;
        }
        else
            return this.function1.derivative();
    }

    @Override
    public String toString(){
        String str = "(";
        for(int i = 0; i < this.power - 1; i++)
            str += this.function1.toString() + " * ";
        str += this.funcs[this.power - 1].toString() + ")";
        return str;
    }
}


