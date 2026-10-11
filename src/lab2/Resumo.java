package lab2;

import java.util.Objects;

public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Resumo resumo = (Resumo) o;
        return Objects.equals(tema, resumo.tema);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tema);
    }

    public String getTema() {
        return tema;
    }

    public String getConteudo() {
        return conteudo;
    }
}
