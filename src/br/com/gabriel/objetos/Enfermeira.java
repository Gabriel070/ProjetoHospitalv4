
package br.com.gabriel.objetos;

import java.util.Date;

public class Enfermeira {
    private int cofen;
    private String setor;

    public Enfermeira(String nome, Date dataNascimento, String cpf, String rg, String endereco, String telefone, String estadoCivil, char sexo, int cofen, String setor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCofen() {
        return cofen;
    }

    public void setCofen(int cofen) {
        this.cofen = cofen;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Enfermeira(int cofen, String setor) {
        this.cofen = cofen;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Enfermeira{" + "cofen=" + cofen + ", setor=" + setor + '}';
    }
}