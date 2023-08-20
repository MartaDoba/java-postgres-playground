package com.example;
import java.util.Scanner;

public class Calculadora {
    

     public static void main(String[] args) {
        int n;
        int m;
        

        Scanner scanar = new Scanner (System.in);
        System.out.println("Olá, seja bem vindo!!");

        System.out.println("Digite o valor de n");
        n = scanar.nextInt();
        System.out.println("Digite o valor de m");
        m = scanar.nextInt();
        
        if ((n | m ) < 10){
            System.out.println(n + " ou " + m + " é menor do que 10 ");
        }
        
        else if (n > m & (n*m > 10)){
            System.out.println(" O valor do número um vezes o numero 2, é maior do que 10 e n é maior do que m");
        }
        else{
            System.out.println(" Obriga por ultilizar o sistema!! ");
        }
      



     }
 
    }
        


        
    

    


