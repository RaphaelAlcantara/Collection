package Map;

import java.util.*;

/*
Dada a população estumada de alguns estados do NE, faça:
•Estado = PE - População = 9.616.621
•Estado = AL - População = 3.351.543
•Estado = CE - População = 9.187.103
•Estado = RN - População = 3.534.265

a) Crie um dicionário e relacione os estados com as suas populações;
b) Substitua a população do estado do RN por 3.534.165;
c) Confira se o estado de PB existe, caso não adicione: PB - 4.039.277;
d) Exiba a população de PE;
e) Exiba todos os estados e as suas populações na ordem de inseridos;
f) Exiba os estados com população na ordem alfabética;
g) Exiba o estado com o menor número de habitantes e a sua quantidade;
h) Exiba o estado com o maior número de habitantes e a sua quantidade;
i) Exiba a soma das populações dos estados;
j) Exiba a média das populações dos estados;
k) Remova os estados com população menor que 4.000.000;
l) Apague o dicionário;
m) Confira se o dicionário está vazio;

 */
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("a) Crie um dicionário e relacione os estados com as suas populações;");
        Map<String, Double> estadosNE = new HashMap<String, Double>(){{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};
        System.out.println(estadosNE);
        System.out.println("b) Substitua a população do estado do RN por 3.534.165;");
        estadosNE.put("RN", 3.534165);
        System.out.println(estadosNE);

        System.out.println("c) Confira se o estado de PB existe, caso não adicione: PB - 4.039.277;");
        boolean PB = estadosNE.containsKey("PB");
        if(!PB){
            estadosNE.put("PB", 4.039277);
        }
        System.out.println(estadosNE);

        System.out.println("d) Exiba a população de PE;");
        System.out.println(estadosNE.get("PE"));

        System.out.println("e) Exiba todos os estados e as suas populações na ordem de inseridos;");
        Map<String, Double> estadosNE2 = new LinkedHashMap<String, Double>(){{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};
        System.out.println(estadosNE2);

        System.out.println("f) Exiba os estados com população na ordem alfabética;");
        Map<String, Double> estadosNE3 = new TreeMap<>(estadosNE2);
        System.out.println(estadosNE3);

        System.out.println("g) Exiba o estado com o menor número de habitantes e a sua quantidade;");
        Double min = Collections.min(estadosNE.values());
        for(Map.Entry<String, Double> entry : estadosNE.entrySet()){
            if(entry.getValue().equals(min)){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.println("h) Exiba o estado com o maior número de habitantes e a sua quantidade;");
        Double max = Collections.max(estadosNE.values());
        for(Map.Entry<String, Double> entry : estadosNE.entrySet()){
            if(entry.getValue().equals(max)){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.println("i) Exiba a soma das populações dos estados;");
        Double soma = 0.0;
        for(Map.Entry<String, Double> entry : estadosNE.entrySet()){
            soma += entry.getValue();
        }
        System.out.println(soma);

        System.out.println("j) Exiba a média das populações dos estados;");
        Double media = soma / estadosNE.size();
        System.out.println(media);

        System.out.println("k) Remova os estados com população menor que 4.000.000;");
        estadosNE.entrySet().removeIf(entry -> entry.getValue() > 4.000000);
        System.out.println(estadosNE);

        System.out.println("l) Apague o dicionário;");
        estadosNE.clear();

        System.out.println("m) Confira se o dicionário está vazio;");
        System.out.println(estadosNE.isEmpty());
    }
}
