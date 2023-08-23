package com.example;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String[] getEndereco() {
        return endereco;
    }

    public void setEndereco(String[] endereco) {
        this.endereco = endereco;
    }

    private float altura;
    private int idade;
    private String [] endereco = new String[200];

    public static void main(String[] args) {
       

    Pessoa pessoa = new Pessoa();
    System.out.println("Seja Bem vindo(a)"  + "\n" + " Digite o seu nome: ");
    Scanner scan = new Scanner (System.in);
    pessoa.nome = scan.nextLine();

    System.out.println("Seja Bem vindo(a)"  + "\n" + " Digite a sua altura: ");
    pessoa.altura = scan.nextFloat();

    System.out.println("Digite a sua idade");
    pessoa.idade = scan.nextInt();

    System.out.println("Digite o seu endereço");
    pessoa.endereco [0] = scan.next();
    

    System.out.println("Prezada " + pessoa.nome + " sua idade é: " + pessoa.idade + " seu endereco é: " + pessoa.endereco);
   // System.out.println(" A sua alatura é: " pessoa.altura);




        
    }
    
}
