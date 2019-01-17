/******************************************
 * INSTITUTO TECNOLOGICO DE CHILPANCINGO  *
 * INGENIERIA EN SISTEMAS COMPUTACIONALES *
 * AUTORES:                               *
 *-CYNTHIA DANIELA GARCÍA GONZÁLEZ        *
 * -DAVID FERNANDO CARBAJAL CABRERA               *
 * -JOSE MANUEL HERNADEZ ANTAÑO    
 *PROGRAMA: Programa1_ParImpar
 * ****************************************/
package Programas;
/*Programa que imprime numeros del 1 - 100, cuando encuentre un numero par
imprimirá el nombre del equipo, cuando sea impar imprimirá las iniciales
de la materia Programacion Lógica y Funcional(PLF) y cuando el numero
sea divisible entre 10 imprmirá BINGO*/

//Clase Programa1_ParImpar
public class Programa1_ParImpar {
    public static void main(String[]args){
        //for que nos permite recorrer numeros del 1 al 100
        for(int i=0; i<=100; i++){
            //PRIMERA CONDICION: si el numero es divisible entre 10
           if(i%10==0){
               //Imprimimos el numero y BINGO
                System.out.println(i + " BINGO");
            }else//DE CASO CONTRARIO:
               //SEGUNDA CONDICION: si es par
               if(i%2==0){
                   //Imprimos Par: Murdock
                   System.out.println(i +" Par: Murdock");
                   //DE CASO CONTRARIO: 
               }else{ 
                   //Imprimimos Impar: PLF
                   System.out.println(i +" Impar: PLF");
               }//fin de else
        }//fin de for
    }//fin del main
}//fin de la clase
