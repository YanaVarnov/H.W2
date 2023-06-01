public class Negation extends Product{
    public Negation (Function function){super(function, new Constant(-1));}

    @Override
    public String toString(){
        String str = "(-" + this.function1.toString() + ")";
        return str;
    }
}
