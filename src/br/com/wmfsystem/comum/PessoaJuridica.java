package br.com.wmfsystem.comum;

/**
 * Created by wmfsystem on 3/8/17.
 */
public abstract class PessoaJuridica extends Pessoa {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PessoaJuridica that = (PessoaJuridica) o;

        return cnpj != null ? cnpj.equals(that.cnpj) : that.cnpj == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cnpj != null ? cnpj.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}
