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
/*PROGRAMA EN JAVA CON LA CREACION DE LISTAS, PARA INSERTAR ELEMENTOS NUMERICOS EN LA LISTA CREADA*/
package listas;
/*IMPORTACION DE LIBRERIAS*/
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*CLASE InsertarEnLista*/
public class InsertarEnLista {
    /*Main*/
    public static void main(String[] args) {
        /*VARIABLES*/
        int num, tamanioLista;
        List<Integer> listaNumeros;
        /*INICIALIZAMOS LA LISTA*/
        listaNumeros = new ArrayList<>();
        /*AGRAGAMOS ELEMENTOS A LA LISTA CREADA*/
        listaNumeros.add(1);
        listaNumeros.add(3);
        listaNumeros.add(6);
        listaNumeros.add(9);
        listaNumeros.add(12);
        /*HACER: PEDIREMOS QUE EL USUARIO INGRESE UN NUMERO , Y ESTE SE AGREGE A LA LISTA*/
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Un Numero", "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE));
            listaNumeros.add(num);
            /*PREGUNTAREMOS SI DESEA AGREGAR MAS ELEMENTOS*/
            int resp = JOptionPane.showConfirmDialog(null, "Deseas agregar mas numeros");
            /*SI LA RESPUESTA ES NO, YA NO PIDE MAS NUMEROS*/
            if (JOptionPane.NO_OPTION == resp) {
                break;
            }
        } while (true);/*MIENTRAS: SEA VERDADERO*/
        /*LA VARIABLE tamanioLista ALMACENA EL TAMAÑO DE LA LISTA*/
        tamanioLista = listaNumeros.size();
        /*IMPRIMOS LA LISTA*/
        for (int i = 0; i < tamanioLista; i++) {
            System.out.println(listaNumeros.get(i));
        }//FIN DEL FOR

    }//FIN DEL MAIN

}//FIN DE LA CLASE
