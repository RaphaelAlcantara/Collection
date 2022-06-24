package Set;
/*
    Crie uma classe LinguagemFavorita que possua os atributos
    nome, anoDeCriação e ide. em seguida, crie um conjunto com
    3 linguagens e faça um programa que ordene esse conjunto por:

    A - Ordem de inserção
    B - Ordem natural nome
    C - IDE
    D - Ano de criação e nome
    E - Nome, ano de criação e IDE

    Ao final, exiba as linguagens no console, uma abaixo da outra.

 */


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new HashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita("Java", 1995, "Eclipse"));
            add(new LinguagemFavorita("C", 1972, "CLion"));
            add(new LinguagemFavorita("Python", 1991, "Visual Studio"));
        }};

        System.out.println("A - Ordem de inserção");
        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita("Java", 1995, "Eclipse"));
            add(new LinguagemFavorita("C", 1972, "CLion"));
            add(new LinguagemFavorita("Python", 1991, "Visual Studio"));
        }};
        for (LinguagemFavorita l : linguagens1) {
            System.out.println(l);
        }

        System.out.println("B - Ordem natural nome");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        for(LinguagemFavorita l : linguagens2){
            System.out.println(l);
        }

        System.out.println("C - IDE");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(linguagens);
        for(LinguagemFavorita l : linguagens3){
            System.out.println(l.getIde());
        }

        System.out.println("D - Ano de criação e nome");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(linguagens);
        for(LinguagemFavorita l : linguagens4){
            System.out.println(l.getAnoDeCriacao() + " - " + l.getNome());
        }

        System.out.println("E - Nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(linguagens);
        for(LinguagemFavorita l : linguagens5){
            System.out.println(l.getNome() + " - " + l.getAnoDeCriacao() + " - " + l.getIde());
        }

        System.out.println("Linguagens: ");
        for(LinguagemFavorita l : linguagens){
            System.out.println(l.getNome());
        }


    }

}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    String nome;
    int anoDeCriacao;
    String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }


    @Override
    public int compareTo(LinguagemFavorita l) {
        int nome = this.nome.compareTo(l.getNome());
        int ano = Integer.compare(this.anoDeCriacao, l.getAnoDeCriacao());
        int ide = this.ide.compareTo(l.getIde());
        if(nome != 0) return nome;
        if(ano != 0) return ano;
        return ide;
    }
}
