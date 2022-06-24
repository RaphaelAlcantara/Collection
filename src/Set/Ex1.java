package Set;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

/*
    Crie um conjunto contendo as cores do arco-íris.

    A - Exiba todas as cores uma abaixo da outra
    B - Exiba a quantidade de cores do arco-íris
    C - Exiba em ordem alfabética as cores do arco-íris
    D - Exiba em ordem inversa as cores do arco-íris
    E - Exiba todas com a letra V
    F - Remova todas as cores com a letra V
    G - Limpe o conjunto
    H - Verifique se o conjunto está vazio

 */
public class Ex1 {
    public static void main(String[] args) {
        Set<String> ArcoIris = new HashSet<String>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};

        System.out.println("A - Exiba todas as cores uma abaixo da outra");
        for(String cor : ArcoIris){
            System.out.println(cor);
        }

        System.out.println("B - Exiba a quantidade de cores do arco-íris");
        System.out.println(ArcoIris.size());

        System.out.println("C - Exiba em ordem alfabética as cores do arco-íris");
        Set<String> ArcoIrisOrdemAlfabetica = new TreeSet<>(ArcoIris);
        for(String cor : ArcoIrisOrdemAlfabetica){
            System.out.println(cor);
        }

        System.out.println("D - Exiba em ordem inversa as cores do arco-íris");
        Set<String> ArcoIrisOrdemInversa = new LinkedHashSet<>(ArcoIris);

        TreeSet<String> ArcoIrisOrdemInversa2 = new TreeSet<>(Collections.reverseOrder());
        ArcoIrisOrdemInversa2.addAll(ArcoIrisOrdemInversa);
        for(String cor : ArcoIrisOrdemInversa2){
            System.out.println(cor);
        }

        System.out.println("E - Exiba todas que começão com a letra V");
        for(String cor : ArcoIris){
            if(cor.startsWith("V")){
                System.out.println(cor);
            }
        }

        System.out.println("F - Remova todas que começão com a letra V");
        Iterator<String> iterator = ArcoIris.iterator();
        while(iterator.hasNext()){
            String cor = iterator.next();
            if(cor.startsWith("V")){
                iterator.remove();
            }
        }
        for(String cor : ArcoIris){
            System.out.println(cor);
        }

        System.out.println("G - Limpe o conjunto");
        ArcoIris.clear();

        System.out.println("H - Verifique se o conjunto está vazio");
        System.out.println(ArcoIris.isEmpty());




    }
}
