package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Faça um programa que receba a temperatura média dos
    6 primeiros meses do ano e armazene em uma lista.
    Após isto, calcule a média semestral das temperaturas
    e mostre todas as temperaturas acima desta média, e em
    que mês ocorreram pelo valor do mês.

*/
public class exercicio1 {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as temperaturas dos 6 primeiros meses do ano:");

        System.out.print("Digite a temperatura do primeiro mês: ");
        temperaturas.add(scanner.nextDouble());
        System.out.print("Digite a temperatura do segundo mês: ");
        temperaturas.add(scanner.nextDouble());
        System.out.print("Digite a temperatura do terceiro mês: ");
        temperaturas.add(scanner.nextDouble());
        System.out.print("Digite a temperatura do quarto mês: ");
        temperaturas.add(scanner.nextDouble());
        System.out.print("Digite a temperatura do quinto mês: ");
        temperaturas.add(scanner.nextDouble());
        System.out.print("Digite a temperatura do sexto mês: ");
        temperaturas.add(scanner.nextDouble());


        double soma = 0;
        for (Double temperatura : temperaturas) {
            soma += temperatura;
        }
        double media = soma / temperaturas.size();
        System.out.println("Média: " + media);

        System.out.println("Temperaturas acima da média:");

        for(int i = 0; i < temperaturas.size(); i++){
            if(temperaturas.get(i) > media){

                System.out.println("Mês " + (i+1) + " - " + temperaturas.get(i));
            }
        }
    }
}
