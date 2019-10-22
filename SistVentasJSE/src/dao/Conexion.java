package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
   public Connection cnx = null;
   
   public Connection conectar(){
       try {
           String driver = "com.mysql.jdbc.Driver";
           String url = "jdbc:mysql://localhost:3306/DBVentas";
           String user = "root";
           String pwd = "";
           Class.forName(driver).newInstance();
           cnx = DriverManager.getConnection(url, user, pwd);
       } catch (Exception e) {
           e.getMessage();
       }
       return cnx;
   }
   
   public void desconectar() throws SQLException{
       if(cnx==null){
           return;
       }else{
           cnx.close();
       }           
   }   

}
