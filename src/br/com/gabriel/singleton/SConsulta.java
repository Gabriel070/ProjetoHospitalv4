
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Consulta;
import java.util.ArrayList;
import java.util.List;

public class SConsulta {
    List<Consulta> consultas = new ArrayList();

    public List<Consulta> getConsultas() {
        return consultas;
    }
    
    private SConsulta() {
    }
    
    public static SConsulta getInstance() {
        return SConsultaHolder.INSTANCE;
    }
    
    private static class SConsultaHolder {

        private static final SConsulta INSTANCE = new SConsulta();
    }
}