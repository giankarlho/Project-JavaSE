package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginD extends Conexion{

    
    
    public String accesoLogin(String user, String clave) throws Exception{
        String nombreUsu = "";
        try {
            String sql = "select * from personal where usuper=? and pwdusu=?";

            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nombreUsu = rs.getString("nomper");
            } else {
                nombreUsu = "";
            }
            ps.close();
            rs.close();
        } catch (Exception e) {           
            System.out.println("Error en iniciarSesionD " + e.getMessage());
        }
        return nombreUsu;
    }

}
