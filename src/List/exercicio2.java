package List;

/*
    Utilizando listas, faça um programa que realize 5 perguntas
    para uma pessoa sobre um crime. As perguntas são:

    a. "Telefonou para a vítima?"
    b. "Esteve no local do crime?"
    c. "Mora perto da vítima?"
    d. "Devia para a vítima?"
    e. "Já trabalhou com a vítima?"

    Se a pessoa responder "sim" para 2 questões = suspeita
    Se a pessoa responder "sim" para 3 e 4 questões = Cúmplice
    Se a pessoa responder "sim" para todas as questões = Assassino
    Se a pessoa responder "não" para todas as questões = Inocente
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        List<Integer> respostas = new ArrayList<>();

try {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        System.out.println("1 - Sim\n" + "2 - Não");
        System.out.print("Digite a resposta: ");
        respostas.add(scanner.nextInt());

        System.out.println("Esteve no local do crime?");
        System.out.println("1 - Sim\n" + "2 - Não");
        System.out.print("Digite a resposta: ");
        respostas.add(scanner.nextInt());

        System.out.println("Mora perto da vítima?");
        System.out.println("1 - Sim\n" + "2 - Não");
        System.out.print("Digite a resposta: ");
        respostas.add(scanner.nextInt());

        System.out.println("Devia para a vítima?");
        System.out.println("1 - Sim\n" + "2 - Não");
        System.out.print("Digite a resposta: ");
        respostas.add(scanner.nextInt());

        System.out.println("Já trabalhou com a vítima?");
        System.out.println("1 - Sim\n" + "2 - Não");
        System.out.print("Digite a resposta: ");
        respostas.add(scanner.nextInt());

        int count = 0;
        for (Integer resposta : respostas){
            if (resposta == 1) count++;
        }

        if (count == 2){
            System.out.println("Suspeita");
        } else if (count == 3 || count == 4){
            System.out.println("Cúmplice");
        } else if (count == 5){
            System.out.println("Assassino!");
        } else {
            System.out.println("Inocente");
        }
}
catch (Exception e) {
    System.out.println("ERRO! Insira um número referente a opção");
}


    }

}
