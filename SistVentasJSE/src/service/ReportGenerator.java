package service;

import dao.Conexion;
import java.math.BigDecimal;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class ReportGenerator extends Conexion {

//    public final String REPORTE_SIMPLE_CLIENTE = "ListCliente.jasper";

    public JasperPrint generarReporteSimpleCliente() throws JRException, ClassNotFoundException {
        try {
            JasperReport jr = null;
            URL in = this.getClass().getResource("../reports/ListCliente.jasper");
            jr = (JasperReport) JRLoader.loadObject(in);
//            JasperPrint reporteLleno = JasperFillManager.fillReport(REPORTE_SIMPLE_CLIENTE, new HashMap(), this.conectar());
            JasperPrint reporteLleno = JasperFillManager.fillReport(jr, new HashMap(), this.conectar());
            return reporteLleno;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
}
