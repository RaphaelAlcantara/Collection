package Set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {
    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<Serie>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("friends", "comédia", 25));
        }};

        System.out.println("ordene em ordem alatoria:");
        for(Serie serie : minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracaoEP());
        }

        System.out.println("ordene ordem de inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("friends", "comédia", 25));
        }};
        for(Serie serie : minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracaoEP());
        }

        System.out.println("Ordene por tempo de duração: ");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie : minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracaoEP());
        }
    }
}
