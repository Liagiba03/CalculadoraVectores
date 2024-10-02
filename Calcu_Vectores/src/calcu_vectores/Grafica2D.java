package calcu_vectores;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.math.plot.Plot2DPanel;

public class Grafica2D implements ActionListener{
    public double []x = {0.0,0.0};
    public double []y = {0.0,0.0};
    public Plot2DPanel plot = new Plot2DPanel();
    JButton btnRegresar = new JButton("Regresar");
    JFrame espaGrafica;
    Interfaz inter = new Interfaz();

    
    public Grafica2D(){
        
        //plot.addScatterPlot("Datos", x,y);
        //plot.addLinePlot("Linea", x,y);
        plot.addLegend("SOUTH");
        
        espaGrafica=new JFrame();
        espaGrafica.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        espaGrafica.setSize(600,600);
        espaGrafica.add(panelGrafica());
        espaGrafica.setVisible(true);
        //plot.addLinePlot("Linea",Color.BLUE,inter.getArrX(),inter.getArrY());
        
        
    }
    public void actionPerformed(ActionEvent evt){
	
        espaGrafica.dispose();
    }
    
    public JPanel panelGrafica(){
        JPanel principal= new JPanel();
        principal.setLayout(new BorderLayout());
        principal.add(plot,BorderLayout.CENTER);
        principal.add(btnRegresar,BorderLayout.SOUTH);
        btnRegresar.addActionListener((ActionListener) this);
        return principal;
    }
    
    public static void main (String[]ar){
        new Grafica2D();
    }
}