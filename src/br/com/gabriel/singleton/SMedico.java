
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Medico;
import java.util.ArrayList;
import java.util.List;

public class SMedico {
    List<Medico> medicos = new ArrayList();

    public List<Medico> getMedicos() {
        return medicos;
    }
    
    private SMedico() {
    }
    
    public static SMedico getInstance() {
        return SMedicoHolder.INSTANCE;
    }
    
    private static class SMedicoHolder {

        private static final SMedico INSTANCE = new SMedico();
    }
}