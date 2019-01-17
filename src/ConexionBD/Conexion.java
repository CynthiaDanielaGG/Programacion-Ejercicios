
package ConexionBD;
/*******************************************
*INSTITUTO TECNOLOGICO DE CHILPANCINGO     *
*INGENIERIA EN SISTEMAS COMPUTACIONALES    *
*AUTORES:                                  *
*-CYNTHIA DANIELA GARCÍA GONZÁLEZ          *
* -DAVID FERNANDO CARBAJAL CABRERA         *
* -JOSE MANUEL HERNADEZ ANTAÑO             *
*PROGRAMA: Clase Conexion                  *
********************************************/
//Importaciones para la conexion de la BD en MySql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

//Constructor de la clase Conexion
public class Conexion
{
    //Atributos de la clase Conexion de tipo Connection, Statement y ResultSet
    private Connection conexion;
    private Statement sentenciaSQL;
    private ResultSet cdr;
    //Variables de la URL_BD, USER Y PASSWORD
    String URL_bd = "jdbc:mysql://localhost:3306/estudiantes";
    String user = "root";
    String passwd = "dani";
    //Constructor de la clase conexion
    public Conexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        //Cargar el Controlador JDBC
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
    }
    
    //Método para conectar con  la base de datos
    public Connection conectar() throws SQLException
    {
        Connection conexion=null;
        //Conectar con la base de datos
       try{
           Class.forName("com.mysql.jdbc.Driver");
        //conexion = (Connection)DriverManager.getConnection(URL_bd,user,passwd);
        conexion = (Connection)DriverManager.getConnection(URL_bd, user, passwd);
        System.out.println("\n Conexion con exito");
        return conexion;
       }catch(Exception e){
       System.out.println("La conexion no se realizo\n"+e);
       }
        //Crea una sentencia SQL
        sentenciaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
       
        return conexion;
        //Mostrar las tablas en la Base de Datos
        //String [] tabla = tablas();        
    }
    //Funcion: cerrarConexion, que nos permite como su nombre lo dice cerrar la conexion de la BD
    public void cerrarConexion(Connection c){ 
    {
        try{
            c.close();
        }catch(Exception ex){ex.printStackTrace();}
    }
   
    }
    // FUNCION: borrarEstudiante, nos permite a traves de la sentencia SQL la eliminacion de un registro 
    //por medio de correo o email
    public void borrarEstudiante(String correo, Connection con)throws SQLException
    {
        System.out.println("Entre al metodo :D");
        try
        {
            Statement stm = con.createStatement();
            stm.executeUpdate("DELETE FROM datos WHERE correo = '" + correo + "'");
            stm.close();
            JOptionPane.showMessageDialog(null,"REGISTRO ELIMINADO");
        //EN CASO DE HABER UN ERROR IMPRIMIMOS EL ERROR
        }catch(Exception e){
        e.printStackTrace();}
    }
   
}//FIN DE LA CLASE
