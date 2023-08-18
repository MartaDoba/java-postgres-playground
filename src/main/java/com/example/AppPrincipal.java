package com.example;

public class AppPrincipal {
    public static void main(String[] args) {
        AppAprendendo appAprendendo = new AppAprendendo();
        appAprendendo.nomeAluno = "Marta";
        appAprendendo.idaddeAluno = 32;
        appAprendendo.notaAluno = 9;
        appAprendendo.aprovacao = false;

        System.out.println("O nome da aluna é:"+ appAprendendo.nomeAluno );


    }
    
}
