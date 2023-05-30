public class Constant extends Function{
    private double c;
    public Constant(double c){ this.c = c; }
    @Override
    public double valueAt(double x){ return this.c; }

    @Override
    public String toString(){ return "(" + this.c + ")"; }

    @Override
    public Constant derivative(){
        Constant dvt = new Constant(0);
        return dvt;
    }
}
