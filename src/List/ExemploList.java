package List;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as notas nela");
        //notas = [7, 8.5, 9.3 , 5, 7 , 0 ,3.6]
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0)); //indexOf retorna a posição da nota

        System.out.println("Adicione nota 8.0 na posição 4");

        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        //set recebe index e novo elemento
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        //verificar se existe é com contains e retorna boolean
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

//        System.out.println("Imprima as notas uma abaixo da outra");
//        for (Double nota : notas){
//            System.out.println(nota);
//        }

        System.out.println("Exiba a terceira nota adicionada");

    }
}
