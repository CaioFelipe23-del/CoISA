package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;
    private double media;

    public Disciplina(String nomeDisciplina) {
        this(nomeDisciplina, null, null);
    }

    public Disciplina(String nomeDisciplina, double[] notas) {
        this(nomeDisciplina, notas, null);
    }

    public Disciplina(String nomeDisciplina, double[] notas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.pesos = pesos;
        this.media = 0;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    private double calculaMedia() {
        double soma = 0;

        if (this.pesos != null) {
            double somaPesos = 0;
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i] * pesos[i];
                somaPesos += pesos[i];
            }
            this.media = soma / somaPesos;
        } else {
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            this.media = soma / notas.length;
        }

        return this.media;
    }

    public boolean aprovado() {
            return calculaMedia() >= 7.0;
    }

    public String toString(){
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
    }

}
