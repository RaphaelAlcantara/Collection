package Set;

import java.util.Objects;

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer duracaoEP;

    public Serie(String nome, String genero, Integer duracaoEP) {
        this.nome = nome;
        this.genero = genero;
        this.duracaoEP = duracaoEP;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracaoEP() {
        return duracaoEP;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracaoEP=" + duracaoEP +
                '}';
    }

    //quando usa hash code, tem que usar o equals e o hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && duracaoEP.equals(serie.duracaoEP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracaoEP);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEP =  Integer.compare(this.getDuracaoEP(), serie.getDuracaoEP());
        int nome = this.getNome().compareToIgnoreCase(serie.getNome());
        int genero = this.getGenero().compareToIgnoreCase(serie.getGenero());
        if(tempoEP != 0) return tempoEP;
        if(nome != 0) return nome;
        return genero;
    }
}
