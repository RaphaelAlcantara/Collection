package Map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
    //no map em vez de add é put
        System.out.println("Crie um dicionario e relacione os modelos de carros com o consumo");
        //Criando um map
        Map<String, Double> carrosPopulares = new HashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15.2");
        //como não existe chave repetida é só substituir
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        //confere se existe a chave
        System.out.println("Confira se tucson existe no map: " + carrosPopulares.containsKey("tucson"));

        //get retorna o valor da chave
        System.out.println("Exiba o consumo do uno" + carrosPopulares.get("uno"));

        System.out.println("Exiba o terceiro modelo do map: "); // não tem metodo pra isso

        //Keyset retorna todas as chaves do map
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("Exiba os modelos do map:" + modelos);

        Collection<Double> consumo = carrosPopulares.values();
        System.out.println("Exiba apenas os consumos: " + consumo);

        System.out.println("Exiba o modelo mais economico:");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();//retorna todos os valores do map
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
            }
        System.out.println(modeloMaisEficiente);

        System.out.println("Exiba o modelo menos economico:");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();
            }
        System.out.println(modeloMenosEficiente);

        System.out.println("Exiba a soma dos consumos: ");
        Double somaConsumo = 0.0;
        for (Double consumoCarro : consumo) {
            somaConsumo += consumoCarro;
            }
        System.out.println(somaConsumo);


        double media = somaConsumo / consumo.size();
        System.out.println("Exiba a media dos consumos: "+ media);


        System.out.println("Remova quem tem consumo 15.6");

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()) {
            Double consumoCarro = iterator.next();
            if(consumoCarro.equals(15.6))
                iterator.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba por ordem de inserção:");

        //Obs: Linked é ordem de inserção e tree é ordem alfabetica.
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares1);

        System.out.println("Exiba o map ordenado pelo modelo:");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);


        }
    }

