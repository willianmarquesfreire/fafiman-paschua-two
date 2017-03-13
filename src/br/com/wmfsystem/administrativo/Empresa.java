package br.com.wmfsystem.administrativo;

import br.com.wmfsystem.comum.Organizacao;
import br.com.wmfsystem.comum.Pessoa;

import java.util.List;

/**
 * Created by wmfsystem on 3/8/17.
 */
public class Empresa extends Organizacao {

    private List<Pessoa> funcionarios;

    public Empresa() {
    }

    public Empresa(List<Pessoa> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String getNome() {
        return "Empresa " + super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome("Empresa " + nome);
    }

    public List<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Pessoa> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Empresa empresa = (Empresa) o;

        return funcionarios != null ? funcionarios.equals(empresa.funcionarios) : empresa.funcionarios == null;
    }

    @Override
    public int hashCode() {
        return funcionarios != null ? funcionarios.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "funcionarios=" + funcionarios +
                '}';
    }
}
