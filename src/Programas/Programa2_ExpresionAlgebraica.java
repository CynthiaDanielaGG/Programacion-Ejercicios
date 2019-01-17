/******************************************
 * INSTITUTO TECNOLOGICO DE CHILPANCINGO  *
 * INGENIERIA EN SISTEMAS COMPUTACIONALES *
 * AUTORES:                               *
 *-CYNTHIA DANIELA GARCÍA GONZÁLEZ        *
 *-DAVID FERNANDO CARBAJAL CABRERA        *
 *-JOSE MANUEL HERNADEZ ANTAÑO            *
 *PROGRAMA: Programa2_ExpresionAlgebraica *
 * ****************************************/
package Programas;
/*Programa que hace una comparacion logica entre dos ecuaciones,
 si x=((a*b)+c) <= ((c-b)+a) imprimira VERDADERO en caso de que
no se cumpla imprimira FALSO*/

//Importamos la libreria de JOptionPane
import javax.swing.JOptionPane;

//Clase: Programa2_ExpresionAlgebraica
public class Programa2_ExpresionAlgebraica {
    public static void main(String[]args){
        /*Declaracion de variables:
        donde: x1.- almacenará el valor de la primera ecuacion
               x2.- almacenará el valor de la segunda ecuación
               a .- almacenará el valor de a
               b .- almacenará el valor de b
               c .- almacenará el valor de c */
        int x1, x2, a, b, c;
        
        //Peticion de los valores de a,b y c por medio de JOptionPane
        a=Integer.parseInt(JOptionPane.showInputDialog("Dame el valor de a, para la ecuacion x=((a*b)+c) <= ((c-b)+a)"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Dame el valor de b, para la ecuacion x=((a*b)+c) <= ((c-b)+a)"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Dame el valor de c, para la ecuacion x=((a*b)+c) <= ((c-b)+a)"));
        
        //Asignacion de las ecuaciones a las variables x1 y x2
        x1 = ((a*b)+c);
        x2 = ((c-b)+a);
        
        //CONDICION: Si ((a*b)+c) <= ((c-b)+a)
        if(x1 <= x2){
            //Imprime VERDADERO
            JOptionPane.showMessageDialog(null, x1 +" <= "+ x2 +":  VERDADERO");
        //De caso contrario
        }else{
            //Imprime FALSO
            JOptionPane.showMessageDialog(null,  x1 +" <= "+ x2 +":  FALSO");
        }//Fin de else
    }//Fin del main
}//Fin de la clase
