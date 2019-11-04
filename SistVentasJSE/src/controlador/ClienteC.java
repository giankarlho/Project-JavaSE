package controlador;

import dao.ClienteImpl;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import vista.ClienteView;

public class ClienteC implements Serializable {

    ClienteImpl dao;
    Cliente cli;
    ClienteView vista;

    public ClienteC() {
        cli = new Cliente();
    }

    public void registrar() {
        try {
            dao = new ClienteImpl();
            getDatos();
            dao.registrar(cli);
        } catch (Exception e) {
            System.out.println("Error en registrarC " + e.getMessage());
        }
    }

    public void modificar() {
        dao = new ClienteImpl();
        try {
            getDatos();
            System.out.println("idCliente " + ClienteView.idCliente);
            dao.modificar(cli);
        } catch (Exception e) {
            System.out.println("Error en modificarC " + e.getMessage());
        }
    }

    public void eliminar() {
        dao = new ClienteImpl();
        try {
            dao.eliminar(cli.getId());
        } catch (Exception e) {
            System.out.println("Error en eliminarC " + e.getMessage());
        }
    }

    public void listar(DefaultTableModel modelo, Integer tipo, String dato) {
        try {
            dao = new ClienteImpl();
            dao.listar(modelo, tipo, dato);
        } catch (Exception e) {
            System.out.println("Error en registrarC " + e.getMessage());
        }
    }

    public void getDatos() {
        try {
            cli.setId(ClienteView.idCliente);
            cli.setApellido(ClienteView.txtApe.getText());
            cli.setNombre(ClienteView.txtNom.getText());
            cli.setDni(ClienteView.txtDNI.getText());
            cli.setSexo(ClienteView.sexo);
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            cli.setNacimiento(Date.valueOf(formatoFecha.format(ClienteView.jdFecha.getDate())));
        } catch (Exception e) {
            System.out.println("Error en getDatos " + e.getMessage());
        }
    }

}
