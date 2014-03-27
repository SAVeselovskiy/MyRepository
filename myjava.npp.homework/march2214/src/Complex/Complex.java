package Complex;
import static java.lang.Math.*;
/**
 * Created by Сережа on 24.03.14.
 */
public class Complex implements TrigonometricForm, ComplexActions, ComplexMath {
    private double a;
    private double b;
    public String toString(){
        String s=new String();
        s+=a + " ";
        if(b>0){
            s+="i" + b;
        }
        else if(b<0){
            s+="-i" + b*(-1);
        }

        return s;
    }

    public Complex(double a, double b){
        this.a=a;
        this.b=b;
    }
    public Complex(){
        this.a=0;
        this.b=0;
    }


    @Override
    public double getModule() {
        return sqrt(a * a + b * b);
    }

    @Override
    public double getArg() {
        return atan(b/a);
    }

    @Override
    public void conjugate() {
        this.b=-b;
    }

    @Override
    public void sum(Complex complex) {
        this.a+=complex.a;
        this.b+=complex.a;
    }

    @Override
    public void difference(Complex complex) {
        this.a-=complex.a;
        this.b-=complex.b;
    }

    @Override
    public void productOnNumber(double number) {
        this.a*=number;
        this.b*=number;
    }
}

