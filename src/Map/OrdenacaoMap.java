package Map;

import java.util.*;
import java.util.function.Function;

public class OrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Crie uma lista de livros");
        Map<String, Livro> meusLivros = new HashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o seculo 21", 432));
        }};


        System.out.println("Imprima em ordem aleatoria");
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + ": " + livro.getValue().getNome());
        }

        System.out.println("\tImprima em ordem de inserção\t");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o seculo 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + ": " + livro.getValue().getNome());
        }

        System.out.println("\tImprima em ordem alfabética os autores\t");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);

        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + ": " + livro.getValue().getNome());
        }

        System.out.println("\tImprima em ordem alfabetica do nome do livro\t");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(Comparator.comparing(l1 -> l1.getValue().getNome()));

        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3){
            System.out.println(livro.getKey() + ": " + livro.getValue().getNome());
        }

        System.out.println("\tImprima em ordem de paginas do livro\t");
        //class anonima
       /* Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new Comparator<Map.Entry<String, Livro>>() {
            @Override
            public int compare(Map.Entry<String, Livro> L1, Map.Entry<String, Livro> L2) {
                return L1.getValue().getPaginas().compareTo(L2.getValue().getPaginas());
            }
        });*/

        //Usando comparing
       /* Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<String, Livro>, Integer>() {
            @Override
            public Integer apply(Map.Entry<String, Livro> L1) {
                return L1.getValue().getPaginas();
            }
        }));*/

        //Apaga do new até o nome da variavel, depois do parentese da variavel até o return
        //usando lambda
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(Comparator.comparing( L1 ->L1.getValue().getPaginas()));
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros4){
            System.out.println(livro.getKey() + ": " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }
    }
}
class Livro{
    private final String nome;
    private final Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

}
//Criar comparator para ordenar livros
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

/*class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}*/