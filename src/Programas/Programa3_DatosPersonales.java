/*****************************************
* INSTITUTO TECNOLOGICO DE CHILPANCINGO  *
* INGENIERIA EN SISTEMAS COMPUTACIONALES *
* AUTORES:                               *
* -CYNTHIA DANIELA GARCIA GONZALEZ       *
* -DAVID FERNANDO CARBAJAL CABRERA       *
* -JOSE MANUEL HERNADEZ ANTAÑO           *
*PROGRAMA: Programa3_DatosPersonales     *
******************************************/
package Programas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*Programa en java que mostrará un menu en el cual tendra 3 opciones: 1.-Insertar, 2.-Leer Datos 
y 3.- Salir. Todo esto en base a el numero de la opcion correspondiente(1 para insertar, 2 para leer
y 3 para salir del programa)Si la eleccion del usuario es 1, el programa pedira datos del estudiante como:
nombre, correo electronico, carrera y telefono, Si el usuario elige la opcion 2, leerá los datos del
archivo y si su eleccion es 3, se saldra del programa*/

//Clase Programa3_DatosPersonales
public class Programa3_DatosPersonales {
    /*Declaramos las variables de tipo FileInputStream y JFileChooser(Nos 
    permitiran interactuar con archivos*/
    FileInputStream entrada;
    JFileChooser selec = new JFileChooser();

    /*FUNCION: ingresarEstudiante: que como su nombre lo indica nos permitirá escribir en un
    archivo .txt los datos de un estudiante*/
    public void ingresarEstudiante(String nombre, String correo, String carrera, String telefono) {
        /*Declaracion de las variables de la cabecera y de los datos que insertaremos en el 
        archivo .txt, asi como una variable de tipo File que nos permitirá crear el archivo txt*/
        String cabecera = "Nombre:" + "\t" + "Correro    " + "\t" + "Carrera    " + "\t" + "    Telefono\n";
        String datos = nombre + "\t" + correo + "\t" + carrera + "\t" + telefono + "\n";
        File archivo = new File("Estudiantes.txt");//Nombre del archivo
        //Codigo que puede tener un error en el momento de leer el archivo
        try {
            //Si el archivo existe
            if (archivo.exists()) {
                //Leemos los datos del archivo y hacemos un salto de linea
                String datas = LeerArchivo(archivo) + "\n"; 
                //Creamos la variable de tipo FileWrite para guardar el archivo txt
                FileWriter guardar = new FileWriter(archivo);
                //Guardamos los datos existentes mas los que ingresamos
                guardar.write(datas + datos);
                //cerramos el archivo que guardamos
                guardar.close();
                //Informamos al ususario que se guardo el archivo exitosamente
                JOptionPane.showMessageDialog(null, "Guardado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {//de caso contrario
                //Creamos la variable de tipo FileWrite para escribir un nuevo documento a guardar
                FileWriter guardar = new FileWriter(archivo);
                //Escribimos en el archivo la cabezera y los datos ingresados
                guardar.write(cabecera + datos);
                //Cerramos el archivo
                guardar.close();
                //Informamos que se guardo exitosamente el archivo
                JOptionPane.showMessageDialog(null, "Guardado Exitosamente", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }//fin del else
            //en caso de que el archivo atrape un error
        } catch (IOException ex) {
            //No informara que no se ah guardado el archivo
            JOptionPane.showMessageDialog(null, "El archivo no se ha guardado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }//fin del catch
    }//fin del metodo ingresarEstudiante

    //FUNCION: leerEstudiantes, nos permitirá leer el archivo donde almacenamos los datos del estudiante
    //mediante el metodo LeerArchivo
    public void leerEstudiantes() {
        //Creamos la variable de tipo File
        File archivo = new File("Estudiantes.txt");
        //Imprimimos los datos del archivo con el metodo LeerArchivo
        System.out.println(LeerArchivo(archivo));
    }
    //Funcion:LeerArchivo, nos permitirá leer el archivo donde almacenamos los datos del estudiante
    public String LeerArchivo(File archivo) {
        //Creamos una variable de tipo String
        String textoLeido = "";
        //Codigo que puede tener un error en el momento de leer el archivo
        try {
            //leemos el archivo linea por lines y caracter por caracter
            entrada = new FileInputStream(archivo);
            int simbolo;
            while ((simbolo = entrada.read()) != -1) {
                char caracter = (char) simbolo;
                textoLeido += caracter;
            }//fin del while
            //En caso de existir un error al leer el archivo nos indicara con un mensaje
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }//fin del catch
        //retorna una variable de tipo File
        return textoLeido;
    }//Fin del metodo LeerArchivo

    //Metodo main: nos permitira ejecutar el programa
    public static void main(String[] args) {
        //Creamos un objeto de tipo Programa_DatosPersonales
        Programa3_DatosPersonales estudiante = new Programa3_DatosPersonales();
        //Mostramos el menu de opciones
        String opcion=JOptionPane.showInputDialog(null,"==MENU==\n1.-Insertar datos\n2.-Leer Archivo\n3.-Salir");
       
        do{//Hacer
       //Si la opcion es 1
        if(Integer.parseInt(opcion)==1){
            //Pedimos los datos del alumno
            String nombre=JOptionPane.showInputDialog(null, "Nombre del estudiante:");
            String correo=JOptionPane.showInputDialog(null, "Correo del alumno:");
            String carrera=JOptionPane.showInputDialog(null, "Carrera del alumno:");
            String numero= JOptionPane.showInputDialog(null, "Numero telefonico del estudiante:");
            estudiante.ingresarEstudiante(nombre, correo, carrera, numero);
        }//Fin del If
        //si la opcion es 2
        if(Integer.parseInt(opcion)==2){
            //leemos los datos del estudiante
            estudiante.leerEstudiantes();
        }//fin del if
        //Si la opcion es 3
        if(Integer.parseInt(opcion)==3){
            //salimos del programa
            System.exit(0);
        }//fin del if
        //mostramos nuevamente el menu
    opcion=JOptionPane.showInputDialog(null,"==MENU==\n1.-Insertar datos\n2.-Leer Archivo\n3.-Salir");
    //mientras la opcion sea diferente de 3 mostrar el menu
       }while(Integer.parseInt(opcion)!=3);
    }//fin de main
}//fin de la clase 
