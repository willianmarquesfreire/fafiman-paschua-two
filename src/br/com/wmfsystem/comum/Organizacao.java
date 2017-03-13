package br.com.wmfsystem.comum;

/**
 * Created by wmfsystem on 3/8/17.
 */
public abstract class Organizacao {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organizacao that = (Organizacao) o;

        return nome != null ? nome.equals(that.nome) : that.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Organizacao{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
