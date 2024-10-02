
package calcu_vectores;

import static java.lang.Math.sqrt;
import javax.swing.JTextPane;

public class Operaciones2D {
    
   
    //COMPONENTE A 2D
    public double componenteA(double mag, double ang){
        Double angRad = Math.toRadians(ang);
        Double compA = mag*(Math.cos(angRad));
        
        return compA;
    }
    
    //COMPONENTE B 2D
    public double componenteB(double mag, double ang){
        Double angRad = Math.toRadians(ang);
        Double compB = mag*(Math.sin(angRad));
        
        return compB;
    }
    
    //CALCULAR ANGULO
    public double calcularAngulo(double a, double b){
        Double division = b/a;
        Double angRad = Math.atan(division);
        Double angF = Math.toDegrees(angRad);
        if(angF<0){
            angF= 180+angF;
        }
        
        return angF;
    }
    
    //CALCULAR MAGNITUD 2D
    public double calcularMagnitud2D(double a, double b){
        Double magnitud= sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        
        return magnitud;
    }
     
     //CALCULAR MAGNITUD 3D
    public double calcularMagnitud3D(double a, double b, double c){
        
        Double magnitud= sqrt((Math.pow(calcularMagnitud2D(a,b),2)+(Math.pow(c,2))));
        
        return magnitud;
    }
    
    //PRODUCTO PUNTO VECTOR 2D
    public double productoPunto2D(double x1, double y1, double x2, double y2){
        //ES ESCALAR
        Double cant = (x1*x2)+(y1*y2);
        return cant;
    }
    
     //PRODUCTO PUNTO VECTOR 3D
    public double productoPunto3D(double x1, double y1, double z1, double x2, double y2, double z2){
        //ES ESCALAR
        Double cant = (x1*x2)+(y1*y2)+(z1*z2);
        
        return cant;
    }
    
    //PRODUCTO PUNTO ANGULO
    public double productoPuntoAngulo(double productoPunto, double magVector1, double magVector2){
        
        Double multi= productoPunto/(magVector1*magVector2);
        
        Double angulo= Math.toDegrees(Math.acos(multi));
        return angulo;
    }
    
    //PRODUCTO CRUZ 3D
    public double productoCruz3D(double x1, double y1, double z1, double x2, 
            double y2, double z2, JTextPane a, JTextPane b, JTextPane c){
        Double compx= (y1*z2)-(y2*z1);
        Double compy= ((x1*z2)-(x2*z1))*-1;
        Double compz= (x1*y2)-(x2*y1);
        Double mag = calcularMagnitud3D(compx,compy,compz);
        a.setText(compx.toString());
        b.setText(compy.toString());
        c.setText(compz.toString());
        return mag;
    }
    
    //PRODUCTO CRUZ ANGULO
    public double productoCruzAngulo(double productoCruz, double magVector1, double magVector2){
        
        Double multi= productoCruz/(magVector1*magVector2);
        
        Double angulo= Math.toDegrees(Math.asin(multi));
        return angulo;
    }
    
    //SUMA VECTORES 2D
    public Double[][] sumaVector2D(Double[][] vec){
        Double sum[][]= new Double[1][2];
        for(int i = 0, k=0; i<vec[0].length;i++,k++){
            double suma=0; 
            for(int y=0; y<vec.length;y++){
                suma+= vec[y][i];
            }
            sum[0][k]=suma;
        }
        return sum;
    }
    //SUMA VECTORES 3D
    public Double[][] sumaVector3D(double[][] vec){
        Double sum[][]= new Double[1][3];
        for(int i = 0, k=0; i<vec[0].length;i++,k++){
            double suma=0; 
            for(int y=0; y<vec.length;y++){
                suma+= vec[y][i];
            }
            sum[0][k]=suma;
        }
        return sum;
    }
    //RESTA VECTORES 3D
    public Double[][] restaVector3D(double[][] vec){
        Double res[][]= new Double[1][3];
        
        for(int i = 0; i<vec[0].length;i++){
             double resta=0;
            for(int y=0; y<vec.length;y++){
                if(i==0 && y==0 || i==1 && y==0 || i==2 && y==0){
                    resta = vec[y][i];
                }else{
                resta-= vec[y][i];
                }
            }
            res[0][i]=resta;
        }
        return res;
    }
    //RESTA VECTORES 2D
    public Double[][] restaVector2D(double[][] vec){
        Double res[][]= new Double[1][2];
        
        for(int i = 0; i<vec[0].length;i++){
             double resta=0;
            for(int y=0; y<vec.length;y++){
                if(i==0 && y==0 || i==1 && y==0){
                    resta = vec[y][i];
                }
                else{
                resta-= vec[y][i];
                }
            }
            res[0][i]=resta;
        }
        return res;
    }
    //VECTOR POR ESCALAR
}
