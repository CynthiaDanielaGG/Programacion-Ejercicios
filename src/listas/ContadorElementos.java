
package listas;

/*
******************************************
*INSTITUTO TECNOLOGICO DE CHILPANCINGO   *
*INGENIERIA EN SISTEMAS COMPUTACIONALES  *
*PROGRAMACION LOGICA Y FUNCIONAL         *
*AUTORES:                                *
*-CYNTHIA DANIELA GARCIA GONZALEZ        *
*-JOSE HERNANDEZ ANTAÑO                  *
*-DAVID FERNANDO CARBAL CABRERA          *
******************************************/
/*programa que crea una lista con un numero n de elementos y cuentas cuantas ocurrencias tiene el numero en la lista*/
/*IMPORTACION DE LIBRERIAS*/
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*CLASE: Lista1*/
public class ContadorElementos {
    /*MAIN*/
    public static void main(String[] args) {
        //CREACION DE LA LISTA
       List<Integer> lista = new ArrayList();
       /*PEDIMOS EL NUMERO DE ELEMENTOS*/
       int total=Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numero anotaras en la lista"));
       /*FOR: PEDIMOS EL VALOR DE LOS ELEMENTOS DESEADOS*/
        for (int i = total; i >= 1; i--) {
            int num=Integer.parseInt(JOptionPane.showInputDialog(null,"puedes anotar "+i+"  numeros "));
            lista.add(num);//AGREGAMOS A LA LISTA
        }
        /*IMPRIMIMOS LA LISTA*/
         System.out.print(lista);
         /*PEDIMOS EL NUMERO QUE DESEE BUSCAR*/
        int buscar = Integer.parseInt(JOptionPane.showInputDialog(null,"numero a contar sus ocurrencias"));
        int j=0;
        /*RECORREMOS LA LISTA*/
        for (int k = 0; k < lista.size(); k++) {
            /*SI EL NUMERO COHINCIDE CON EL BUSCADO, SE AUMENTA EL CONTADOR*/
            if(buscar == lista.get(k)){
                j++;
            }//FIN DEL IF
        }//FIN DEL FOR
        /*IMPRIMIMOS RESULTADOS*/
       JOptionPane.showMessageDialog(null,"El numero "+ buscar +" aparece "+j+" veces");
        System.out.println(j);
    }//FIN DE MAIN
}
