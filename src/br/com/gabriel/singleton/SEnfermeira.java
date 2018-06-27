
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Enfermeira;
import java.util.ArrayList;
import java.util.List;

public class SEnfermeira {
    List<Enfermeira> enfermeiras = new ArrayList();

    public List<Enfermeira> getEnfermeiras() {
        return enfermeiras;
    }
    private SEnfermeira() {
    }
    
    public static SEnfermeira getInstance() {
        return SEnfermeiraHolder.INSTANCE;
    }
    
    private static class SEnfermeiraHolder {

        private static final SEnfermeira INSTANCE = new SEnfermeira();
    }
}