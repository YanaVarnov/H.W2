public class MultiProduct extends Function{
    protected Function[] functions;
    private int funcNum;

    public MultiProduct(Function ... funcs){
        this.funcNum = funcs.length;
        this.functions = new Function[this.funcNum];
        for(int i = 0; i < funcNum; i++)
           this.functions[i] = funcs[i];
    }

    public MultiProduct(Function func, int n){
        this.funcNum = n;
        for(int i = 0; i < n; i++)
            this.functions[i] = func;
    }
    @Override
    public double valueAt(double x){
        double value = 1;
        for(int i = 0; i < funcNum; i++)
            value *= this.functions[i].valueAt(x);
        return value;
    }

    @Override
    public String toString(){
        String str = "(";
        for(int i = 0; i < this.funcNum - 1; i++)
            str += this.functions.toString() + " * ";
        str += this.functions[this.funcNum - 1].toString() + ")";
        return str;
    }

    @Override
    public MultiSum derivative(){
        MultiProduct[] devFunc = new MultiProduct[this.funcNum];
        Function[] miniProduct = new Function[this.funcNum];
        for(int i = 0; i < this.funcNum; i++){
            miniProduct[0] = this.functions[i].derivative();
            for(int j = 1; j < this.funcNum; j++){
                if(i != j)
                    miniProduct[j] = this.functions[i];
            }
            devFunc[i] = new MultiProduct(miniProduct);
        }
        MultiSum dvt = new MultiSum(devFunc);
        return dvt;
    }

}
