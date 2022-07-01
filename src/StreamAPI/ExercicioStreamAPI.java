package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
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



    }
}
