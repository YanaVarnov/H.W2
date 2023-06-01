import java.lang.Math;
public class Polynomial extends Function {
    private double[] coefficients;

    public Polynomial(double... coefficients){
        this.coefficients = new double[coefficients.length];
        for(int i = 0; i < coefficients.length; i++){
            this.coefficients[i] = coefficients[i];
        }
    }
    @Override
    public double valueAt(double x){
        double value = 0;
        for(int i = 0; i < this.coefficients.length; i++){
            value += this.coefficients[i] * Math.pow(x, i);
        }
        return value;
    }

    @Override
    public Polynomial derivative(){
        double[] dvtCo = new double[this.coefficients.length - 1];
        for(int i = 0; i < dvtCo.length; i++){
            dvtCo[i] = this.coefficients[i + 1] * (i + 1);
        }
        Polynomial dvt = new Polynomial(dvtCo);
        return dvt;
    }


    @Override
    public String toString(){
        String str = "(";
        boolean flagFirst = true, flagInt = false;
        if(this.coefficients[0] != 0){
            if(this.coefficients[0] % 1 == 0)
                str += (int)this.coefficients[0];
            else
                str += this.coefficients[0];
            flagFirst = false;
        }
        if(this.coefficients.length > 1 && this.coefficients[1] != 0){
            if(this.coefficients[1] % 1 == 0)
                flagInt = true;
            if(flagFirst){
                if(this.coefficients[1] == 1) {
                    str += "x";
                    flagFirst = false;
                }
                else if(this.coefficients[1] == -1){
                    str += "-x";
                    flagFirst = false;
                }
                else{
                    if(flagInt)
                        str += (int)this.coefficients[1] + "x";
                    else
                        str += coefficients[1] + "x";
                    flagFirst = false;
                }
            }
            else{
                if(this.coefficients[1] == 1)
                    str += " + x";
                else if(this.coefficients[1] == -1)
                    str += " - x";
                else if(this.coefficients[1] > 0){
                        if(flagInt)
                            str += " + " + (int)this.coefficients[1] + "x";
                        else
                            str += " + " + this.coefficients[1] + "x";
                }
                else{
                    if(flagInt)
                    str += " - " + (int)(this.coefficients[1] * -1) + "x";
                    else
                        str += " - " + (this.coefficients[1] * -1) + "x";

                }
            }
        }
        for(int i = 2; i < this.coefficients.length; i++){
            flagInt = false;
            if(this.coefficients[i] % 1 == 0)
                flagInt = true;
            if(flagFirst){
                if(this.coefficients[i] == 0)
                    continue;
                else if(this.coefficients[i] == 1) {
                    str += "x^" + i;
                    flagFirst = false;
                }
                else if(this.coefficients[i] == -1){
                    str += "-x^" + i;
                    flagFirst = false;
                }
                else{
                    if(flagInt){
                        str += (int)this.coefficients[i] + "x^" + i;
                        flagFirst = false;
                    }
                    else{
                        str += this.coefficients[i] + "x^" + i;
                        flagFirst = false;
                    }

                }
            }
            else{
                if(this.coefficients[i] == 0)
                    continue;
                else if(this.coefficients[i] == 1)
                    str += " + x^" + i;
                else if(this.coefficients[i] == -1)
                    str += " - x^" + i;
                else if(this.coefficients[i] > 0){
                    if(flagInt)
                        str += " + " + (int)this.coefficients[i] + "x^" + i;
                    else
                        str += " + " + this.coefficients[i] + "x^" + i;
                }
                else{
                    if(flagInt)
                        str += " - " + (int)(this.coefficients[i] * -1) + "x^" + i;
                    else
                        str += " - " + (this.coefficients[i] * -1) + "x^" + i;
                }
            }

        }
        str += ")";
        return str;
    }
}
