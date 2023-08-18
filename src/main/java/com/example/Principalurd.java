package com.example;

public class Principalurd {
    public static void main(String[] args) {
        //Criando um novo objeto
        Iurds iurds = new Iurds();
        //DANDO NOVOS VALORES PARA O NOVO OBJETO
        iurds.nome = "Cidade Ocidental";
        iurds.pastor = "Rosenilson";
        iurds.regional = "Rosenilson";

        //CRIANDO NOVO OBJETO
        Iurds iurdD = new Iurds();
        iurdD.nome = "Bairro";
        iurdD.pastor = "Carlos";
        iurdD.regional = "Luis";
    // CHAMANDO OS METHODOS DA CLASSE IURDS
        iurds.igreja ();
        iurdD.igreja();

        
    }
    
}
