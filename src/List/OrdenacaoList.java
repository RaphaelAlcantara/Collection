package List;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
        System.out.println("Crie lista de gatos");

        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};


        System.out.println("--\tOrdene a lista de gatos\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdene a lista de gatos aleatoriamente\t--");
        //utiliza o collections para bagunçar
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdene a lista de gatos por nome\t--");
        Collections.sort(meusGatos); //para funcionar o metodo precisa ter o comparable
        System.out.println(meusGatos);

        System.out.println("--\tOrdene a lista de gatos por idade\t--");
        //interface comparator pois já tem o comparable
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdene a lista de gatos por cor\t--");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdene a lista de gatos por nome, idade e cor\t--");
        Collections.sort(meusGatos, new ComparatorNomeIdadeCor());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //Serve para imprimir o objeto em vez de endereço de memoria
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {

        return this.nome.compareToIgnoreCase(gato.getNome());

    }

}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeIdadeCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        int idade = Integer.compare(g1.getIdade(), g2.getIdade());
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

        if(nome != 0) return nome;
        if(cor != 0) return cor;
        return idade;
    }
}
