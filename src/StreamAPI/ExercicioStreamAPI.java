package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os números da lista:");
/*
        numerosAleatorios.stream()
                .forEach(System.out::println);
        numerosAleatorios.stream().forEach(s -> System.out.println(s));
        numerosAleatorios.forEach(System.out::println);
*/

        System.out.println("Pegue os 5 primeiros numeros e coloque num Set");
        //limit - limita o número de elementos que serão retornados
        numerosAleatorios.stream().
                limit(5).
                collect(Collectors.toSet()) //Set não aceita repetição de elementos
                .forEach(System.out::println);

        System.out.println("Transforme a lista de String em lista de inteiros");
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
                .map(Integer :: parseInt).collect(Collectors.toList());
//                numerosAleatorios1.forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que dois");
        List<Integer> numerosParesMaioresQue2 = numerosAleatorios1.stream()
                .filter(n -> n % 2 == 0 && n > 2)
                .collect(Collectors.toList());
        System.out.println(numerosParesMaioresQue2);

        System.out.println("Mostre a média");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()//só funciona com o map
                .ifPresent(System.out::println);//serve para se média existir retorne o valor, se não, retorne nada


        System.out.println("Mostre a soma");
        OptionalDouble soma = OptionalDouble.of(numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .sum());
        System.out.println(soma.getAsDouble());


        System.out.println("Remova os imares");
        numerosAleatorios1.removeIf(n -> n % 2 != 0);
        System.out.println(numerosAleatorios1);

        
    }
}
