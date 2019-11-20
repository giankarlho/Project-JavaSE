package service;

import dao.Conexion;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;


public class ReportGenerator extends Conexion {

    public final String REPORTE_SIMPLE_CLIENTE = "ListCliente.jasper";
  
    public JasperPrint generarReporteSimplePersonal() throws JRException, ClassNotFoundException {
        try {
            JasperPrint reporteLleno = JasperFillManager.fillReport(REPORTE_SIMPLE_CLIENTE, new HashMap(), this.conectar());
            return reporteLleno;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
}
