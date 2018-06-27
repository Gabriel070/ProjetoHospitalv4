
package br.com.gabriel.objetos;

import java.util.Date;

public class Medico {
   private int crm;
   private String especialidade;
   private String setor;

    public Medico(String nome, String cpf, String rg, String endereco, String telefone, String estadoCivil, String especialidade, String setor, char sexo, int crm, Date dataNascimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Medico(int crm, String especialidade, String setor) {
        this.crm = crm;
        this.especialidade = especialidade;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + ", especialidade=" + especialidade + ", setor=" + setor + '}';
    }
}