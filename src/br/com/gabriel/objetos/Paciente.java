
package br.com.gabriel.objetos;

import java.util.Date;

public class Paciente {
   private int id;
   private int numeroSus;
   private Pessoa responsavel;

    public Paciente(String nome, Date dataNascimento, String cpf, String rg, String endereco, String telefone, String estadoCivil, char sexo, int id, int numeroSus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSus() {
        return numeroSus;
    }

    public void setNumeroSus(int numeroSus) {
        this.numeroSus = numeroSus;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public Paciente(int id, int numeroSus) {
        this.id = id;
        this.numeroSus = numeroSus;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", numeroSus=" + numeroSus + ", responsavel=" + responsavel + '}';
    }
}