
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Atestado;
import java.util.ArrayList;
import java.util.List;

public class SAtestado {
    List<Atestado> atestados = new ArrayList();

    public List<Atestado> getAtestados() {
        return atestados;
    }
    private SAtestado() {
    }
    
    public static SAtestado getInstance() {
        return SAtestadoHolder.INSTANCE;
    }
    
    private static class SAtestadoHolder {

        private static final SAtestado INSTANCE = new SAtestado();
    }
}