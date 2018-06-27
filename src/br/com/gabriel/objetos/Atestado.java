
package br.com.gabriel.objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Atestado {
    private Date dataInicioDoAtestado;
    private Date dataFimDoAtestado;
    private Consulta consulta;
    private int quantidadeDias;
    List<Atestado> atestados = new ArrayList();

    public Atestado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Atestado(Date dataInicio, Date dataFim, int quantidadeDias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Atestado> getAtestados() {
        return atestados;
    }
    
    public Date getDataInicioDoAtestado() {
        return dataInicioDoAtestado;
    }

    public void setDataInicioDoAtestado(Date dataInicioDoAtestado) {
        this.dataInicioDoAtestado = dataInicioDoAtestado;
    }

    public Date getDataFimDoAtestado() {
        return dataFimDoAtestado;
    }

    public void setDataFimDoAtestado(Date dataFimDoAtestado) {
        this.dataFimDoAtestado = dataFimDoAtestado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public Atestado(Date dataInicioDoAtestado, Date dataFimDoAtestado, Consulta consulta, int quantidadeDias) {
        this.dataInicioDoAtestado = dataInicioDoAtestado;
        this.dataFimDoAtestado = dataFimDoAtestado;
        this.consulta = consulta;
        this.quantidadeDias = quantidadeDias;
    }

    @Override
    public String toString() {
        return "Atestado{" + "dataInicioDoAtestado=" + dataInicioDoAtestado + ", dataFimDoAtestado=" + dataFimDoAtestado + ", consulta=" + consulta + ", quantidadeDias=" + quantidadeDias + '}';
    }

    public void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}