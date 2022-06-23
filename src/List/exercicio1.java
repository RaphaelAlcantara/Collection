package List;

import java.util.ArrayList;
import java.util.List;

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

        temperaturas.add(23.0);
        temperaturas.add(26.5);
        temperaturas.add(24.3);
        temperaturas.add(26.4);
        temperaturas.add(26.0);
        temperaturas.add(26.6);

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
