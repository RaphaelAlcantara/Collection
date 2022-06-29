package Map;
/*
Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Ao final, exiba a quantidade de vezes que cada valor foi lancado.
 */

import java.util.Random;

public class Desafio {
    public static void main(String[] args) {

        Random random = new Random();
        int[] dado = new int[6];
        for(int i = 0; i < 100; i++){
            dado[random.nextInt(6)]++;
        }
        //Quantidade de vezes que cada valor foi lancado.
        for(int i = 0; i < dado.length; i++){
            System.out.println("O dado foi lançado número "+(i+1) +" "+ dado[i] + " vezes.");
        }

    }
}
