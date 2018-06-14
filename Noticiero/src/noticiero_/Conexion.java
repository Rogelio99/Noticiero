package noticiero_;

import java.sql.*;
import javax.swing.JOptionPane;



public class Conexion
{
    ResultSet rs;
    Statement stat;
    public String bd = "diarioelplaneta";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost/"+bd;


Connection conn = null;

   public Conexion()
   {
      try{
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection(url,login,password);
             if (conn!=null)
             {
                //JOptionPane.showMessageDialog(null,"Conexión a base de datos "+bd+" exitosa");
                 System.out.print("conexion...ok");
             }
      }catch(SQLException ex)
      {
         System.out.println(ex);
      }
      catch(ClassNotFoundException e)
      {
         System.out.println(e);
      }
   }

   public Connection obtenerConexion()
   {
      return conn;
   }

   public void desconectar(){
      conn = null;
   }
   public ResultSet ejecutar2(){
            return rs;
	}
   public Statement ejecutarStatement()
   {

        return stat;
   }
}
