
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Paciente;
import java.util.ArrayList;
import java.util.List;

public class SPaciente {
    List<Paciente> pacientes = new ArrayList();

    public List<Paciente> getPacientes() {
        return pacientes;
    }
    private SPaciente() {
    }
    
    public static SPaciente getInstance() {
        return SPacienteHolder.INSTANCE;
    }
    
    private static class SPacienteHolder {

        private static final SPaciente INSTANCE = new SPaciente();
    }
}