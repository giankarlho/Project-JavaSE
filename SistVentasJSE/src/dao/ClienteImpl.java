package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class ClienteImpl extends Conexion implements ICRUD<Cliente> {

    // idcli	nomcli	apecli	sexcli	dnicli	naccli
    @Override
    public void registrar(Cliente cliente) throws Exception {
        String sql = "insert into cliente (nomcli,apecli,dnicli,sexcli,naccli) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getDni());
            ps.setString(4, cliente.getSexo());
            ps.setDate(5, cliente.getNacimiento());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrarD " + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void modificar(Cliente cliente) throws Exception {

        String sql = "update cliente set nomcli= ?,apecli=?,dnicli=?,sexcli=?,naccli=? where idcli =?";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getDni());
            ps.setString(4, cliente.getSexo());
            ps.setDate(5, cliente.getNacimiento());
            ps.setInt(6, cliente.getId());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrarD " + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void eliminar(int codigo) throws Exception {
        String sql = "delete from cliente where idcli =?";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrarD " + e.getMessage());
        } finally {
            this.desconectar();
        }
    }
    
    public void listar(DefaultTableModel modelo, Integer tipo, String dato) throws Exception {
        String sql = "";
        switch (tipo) {
            case 1:
                sql = "select * from cliente";
                break;
            case 2:
                sql = "select * from cliente where nomcli like '%" + dato + "%'";
                break;
            case 3:
                sql = "select * from cliente where apecli like '%" + dato + "%'";
                break;
            case 4:
                sql = "select * from cliente where sexcli like '%" + dato + "%'";
                break;
            case 5:
                sql = "select * from cliente where dnicli like '%" + dato + "%'";
                break;
        }
        String datos[] = new String[6];
        Statement st = this.conectar().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            for (int i = 0; i < 6; i++) {
                datos[i] = rs.getString(i + 1);
            }
            modelo.addRow(datos);
        }
        rs.close();
        st.close();
    }

}
