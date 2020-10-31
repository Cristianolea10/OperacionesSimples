/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosolea;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author olea cristian
 */
public class DatosOlea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner (System.in);
       
       float x,y,suma,resta,div,mult;
       double base, exponente, elev;
       double raizx, raizy;
       
        x = Integer.parseInt(JOptionPane.showInputDialog("introdusca un numero"));
        y  = Integer.parseInt(JOptionPane.showInputDialog("introdusca un segundo numero"));
     
        suma = x+y;
        resta = x-y;
        mult = x*y;
        div = x/y;
        elev = Math.pow(base = x, exponente = y);
        raizx = Math.sqrt(x);
        raizy = Math.sqrt(y);
        
        JOptionPane.showMessageDialog(null, "El resultado de la raiz de x es: "+raizx);
        JOptionPane.showMessageDialog(null, "El resultado de la raiz de y es: "+raizy);
        JOptionPane.showMessageDialog(null, "El resultado de la elevacion es: "+elev);
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+suma);
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+resta);
        JOptionPane.showMessageDialog(null, "El resultado de la mult es: "+mult);
        JOptionPane.showMessageDialog(null, "El resultado de la div es: "+div);
    
       
    }
    
}
