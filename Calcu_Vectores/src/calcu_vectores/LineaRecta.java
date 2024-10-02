
package calcu_vectores;

public class LineaRecta {
    
    public double[] calcularEcuacion(double x,double xo,double yo,double a,double b){
        double xo1, yo2, valorX, valorInd;
        double result[]= new double[2];
        //DESPEJANDO t EN CADA ECUACION
            //ECUACION 1
        xo1= xo*-1;
            //ECUACION 2
        //IGUALACIÓN Y DESPEJE
        //yo conserva signo inicial. x, xo se multtiplican por b
        valorX= (x*b)/a;
        valorInd= ((xo1*b)/a)+yo;
        result[0]= valorX;
        result[1]= valorInd;
        /*System.out.println("x:"+x);
        System.out.println("xo1:"+xo1);
        System.out.println("yo:"+yo);
        System.out.println("a:"+a);
        System.out.println("b:"+b);*/
        return result;
    }
}
