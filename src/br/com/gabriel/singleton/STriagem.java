
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Triagem;
import java.util.ArrayList;
import java.util.List;

public class STriagem {
    List<Triagem> triagens = new ArrayList();

    public List<Triagem> getTriagens() {
        return triagens;
    }
    private STriagem() {
    }
    
    public static STriagem getInstance() {
        return STriagemHolder.INSTANCE;
    }
    
    private static class STriagemHolder {

        private static final STriagem INSTANCE = new STriagem();
    }
}