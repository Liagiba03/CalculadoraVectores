
package calcu_vectores;

public class OperacionesPlano {
    public double[] calcularEcuacion(double xo,double yo, double zo,double a,double b, double c){
        double d;
        double result[]= new double[4];
        d=((a*xo)+(b*yo)+(c*zo))*-1;
        result[0]= a;
        result[1]= b;
        result[2]= c;
        result[3]= d;
        return result;
    }
}
