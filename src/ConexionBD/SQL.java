/*******************************************
*INSTITUTO TECNOLOGICO DE CHILPANCINGO     *
*INGENIERIA EN SISTEMAS COMPUTACIONALES    *
*AUTORES:                                  *
*-CYNTHIA DANIELA GARCÍA GONZÁLEZ          *
* -DAVID FERNANDO CARBAJAL CABRERA         *
* -JOSE MANUEL HERNADEZ ANTAÑO             *
*PROGRAMA: Clase SQL                       *
********************************************/
package ConexionBD;
//Importaciones para la conexion de la BD en MySql
import com.mysql.jdbc.ResultSetImpl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//Clase SQL
public class SQL {
    //atributo de la clase SQL de tipo Connection
    private Connection conexion;
    //Constructo SQL que recibe una connection
    public SQL(Connection miConexion){
        conexion=miConexion;
    }
    //Funcion getEstudiantes, que nos permite obtener los registros de los alumnos
    public ResultSet getEstudiantes(){
        
    try{
        
        Statement sentencia;
        sentencia=conexion.createStatement();
        String query= "select * from datos";
        return sentencia.executeQuery(query);
        //En caso de haber error imprimir el error
    }catch(Exception e){System.out.println("Error SQL en el metodo");}
    return null;
    }
}
