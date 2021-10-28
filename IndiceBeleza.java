package IndiceBeleza;

import java.util.Scanner;

public class IndiceBeleza {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        Float altura,alt_umbigo,valorBeleza;

        System.out.println("Descubra logo abaixo seu nível de beleza");
        System.out.println("----------------------------------------");

        System.out.print("Entre com a sua altura:");
        altura = teclado.nextFloat();

        System.out.print("Entre com a altura do seu umbigo até o chão:");
        alt_umbigo = teclado.nextFloat();

        //Calculando valor de phi
        valorBeleza = altura / alt_umbigo;

        System.out.println("Seu índice de beleza é: " + valorBeleza);

        if(valorBeleza >= 1.618){
            System.out.print("Você tem o corpo perfeito!!");
        }
        else{
            System.out.print("Você não tem o corpo perfeito");
        }
    }
}
