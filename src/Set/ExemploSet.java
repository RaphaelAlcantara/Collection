//Não tem duplicatas
//Não tem ordem
package Set;

import java.lang.reflect.Array;
import java.util.*;


public class ExemploSet {
    public static void main(String[] args) {
    Set<Double> notas = new HashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas);
        //Não é possivel trabalhar com posição dentro do Set

        System.out.println("Confira se a nota 5 está no Set: " + notas.contains(5d));

        System.out.println("Exiba a menor nota:" + Collections.min(notas));
        System.out.println("Exiba a maior nota:" + Collections.max(notas));

        double soma = 0d;
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a média das notas: " + soma/notas.size());

        System.out.println("Exiba em ordem crescente: ");
        Set<Double> notasOrdenadas = new TreeSet<Double>(notas);
        System.out.println(notasOrdenadas);


        System.out.println("remova a nota 0: " +  notas.remove(0d));

        System.out.println("remova as notas menos que 7: " + notas.removeIf(n -> n < 7));
        System.out.println(notas);

        System.out.println("Apague todas as notas: ");
        notas.clear();

        System.out.println(notas);
        System.out.println("Verifique se está vazio");
        System.out.println(notas.isEmpty());



    }
}
