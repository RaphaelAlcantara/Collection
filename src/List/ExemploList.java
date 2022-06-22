package List;

import java.util.*;

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
//LinkedList
        LinkedList<Double> notas2 = new LinkedList<>(notas);
        System.out.println("notas2: "+notas2);
        System.out.println("primeiro elemento: "+notas2.getFirst());
        System.out.println("primeira nota removida: "+notas2.removeFirst());
        System.out.println("notas2: "+notas2);
//termina linkedList
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

/*        System.out.println("Imprima as notas uma abaixo da outra");
        for (Double nota : notas){
            System.out.println(nota);
        }*/

        System.out.println("Exiba a terceira nota adicionada");
        //get retorna o elemento na posição
        System.out.println("terceira nota: "+notas.get(2));

        System.out.println("Exiba a menor nota");
        //metodo min retorna o menor elemento da Collection
        System.out.println("Menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota");
        //metodo max retorna o maior elemento da Collection
        System.out.println("Maior nota: " + Collections.max(notas));

       System.out.println("Exiba a soma das notas");
        //interator serve para percorrer a Collection elemento a elemento
        double soma = 0;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){ //Enquanto existir proximo elemento
            soma += iterator.next();//adiciona o elemento na soma
        }
        System.out.println("Soma: " + soma);

        System.out.println("Exiba a media das notas");

        double media = soma / notas.size();
        System.out.println("Media: " + media);

        System.out.println("remova a nota 0");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("remova a nota da posição 0");
        notas.remove(notas.get(0));
        System.out.println(notas);

        System.out.println("remova as notas menores que 7");
        notas.removeIf(nota -> nota < 7);
        System.out.println(notas);

        System.out.println("apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("verifique se a lista é vazia");
        if(notas.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Lista não vazia");
        }


    }
}
