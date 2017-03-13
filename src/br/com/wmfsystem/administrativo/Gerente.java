package br.com.wmfsystem.administrativo;

import br.com.wmfsystem.comum.Pessoa;
import br.com.wmfsystem.comum.PessoaFisica;

import java.time.LocalDate;

/**
 * Created by wmfsystem on 3/8/17.
 */
public class Gerente extends PessoaFisica {

    public Gerente() {

    }

    @Override
    public String getNome() {
        return "Gerente " + super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome("Gerente " + nome);
    }

    @Override
    public LocalDate getDataNascimento() {
        return super.getDataNascimento();
    }

    @Override
    public void setDataNascimento(LocalDate dataNascimento) {
        super.setDataNascimento(dataNascimento);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public String toString() {
        return "Gerente " + this.getNome() + " - " + this.getDataNascimento();
    }


}
