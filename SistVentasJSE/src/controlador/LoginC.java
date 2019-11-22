package controlador;

import dao.LoginD;
import java.io.Serializable;
import javax.swing.JOptionPane;
import vista.Dashboard;
import vista.Login;

public class LoginC implements Serializable{
    
    public static String usuario = "";
    private LoginD dao;
    public LoginC() {
        dao = new LoginD();
    }
    
    public void logear() throws Exception{
        usuario = "";
        String user = Login.txtUser.getText();
        String pwd = Login.txtClave.getText();
        System.out.println("entra aqui");
        usuario = dao.accesoLogin(user,pwd);        
        if(usuario.equals("")){
            JOptionPane.showMessageDialog(null,"Usuario incorrecto");
        }else{
            Login login = new Login();
            login.setVisible(false);
            Dashboard principal = new Dashboard();
            principal.setVisible(true);            
        }
    }
    
}
