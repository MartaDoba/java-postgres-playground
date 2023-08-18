package com.example;

public class Iurds {
    
    String nome;
    String cidade;
    String pastor;
    String regional;

    //CRIANDO UM METHODO
    void igreja ()
    {
    if (pastor == regional){
        System.out.println(" Essa igreja é uma sede porque o pastor é regional" + "\n");
    } 
    else {System.out.println("VALIDANDO");
    }
    }
}
