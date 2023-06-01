public class Constant extends Polynomial{
    public Constant(double c){ super(c);}
    @Override
    public Constant derivative(){
        Constant dvt = new Constant(0);
        return dvt;
    }
}
