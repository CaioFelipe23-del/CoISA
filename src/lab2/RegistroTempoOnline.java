package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 0);
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoEsperado = tempoEsperado;
    }

    public void adicionaTempoOnline(int  tempo) {
        tempoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        if (tempoOnline >= tempoEsperado) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnline + " " + tempoEsperado;
    }
}
