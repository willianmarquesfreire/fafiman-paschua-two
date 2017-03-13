package br.com.wmfsystem;

import br.com.wmfsystem.administrativo.Empresa;
import br.com.wmfsystem.administrativo.Gerente;
import br.com.wmfsystem.comum.Organizacao;
import br.com.wmfsystem.comum.Pessoa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wmfsystem on 3/8/17.
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastre um gerente: ");
        String nome = scanner.nextLine();

        Pessoa gerente = new Gerente();
        gerente.setNome(nome);
        ((Gerente)gerente).setCpf("111.111.111-11");
        gerente.setDataNascimento(LocalDate.now());


        System.out.println("Bem vindo " + gerente.getNome());
        System.out.println("Seu CPF é " + ((Gerente)gerente).getCpf() + " e sua data de nascimento é " + gerente.getDataNascimento());

        System.out.println("Qual é a sua empresa? ");
        String nomeEmpresa = scanner.nextLine();
        Organizacao empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        ((Empresa) empresa).setFuncionarios(Arrays.asList(gerente));

        System.out.println(" Bem vindo a sua empresa: ");
        System.out.println(empresa);

    }
}

