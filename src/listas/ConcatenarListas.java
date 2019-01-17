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
/*PROGRAMA EN JAVA QUE NOS PERMITE CONCATENAR LISTAS */
package listas;
/*IMPORTACIONES DE LIBRERIAS*/
import java.util.ArrayList;
import java.util.List;
/*CLASE: ConcatenarListas*/
public class ConcatenarListas {
    /*Main*/
    public static void main(String[] args) {
        /*CREACION DE LISTAS*/
        List<Integer> lista1, lista2;
        List<List> listaGral;
        /*INICIALIZAMOS LAS LISTAS*/
        lista1 = new ArrayList<>();
        lista2 = new ArrayList<>();
        listaGral = new ArrayList<>();
        /*AGREGAMOS ELEMENTOS A LAS LISTAS*/
        lista1.add(1);
        lista1.add(3);
        lista1.add(6);
        lista1.add(9);
        lista1.add(12);

        lista2.add(13);
        lista2.add(14);
        lista2.add(15);
        lista2.add(16);
        lista2.add(17);
        /*CONCATENAR LISTA*/
        listaGral.add(lista1);
        listaGral.add(lista2);
        /*IMPRIMIMOS LA LISTA CONCATENADA*/
        System.out.println(listaGral);
    }//MAIN
}//CLASE
