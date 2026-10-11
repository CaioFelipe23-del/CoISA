package lab2;

import java.util.Arrays;

public class RegistroResumos {
    private Resumo[] resumos;
    private int tamanho;

    public RegistroResumos(int tamanho) {
        this.resumos = new Resumo[tamanho];
    }

    public void adiciona(String tema, String conteudo) {
        adicionaResumo(tema, conteudo);
    }

    public void adicionaResumo(String tema, String conteudo) {
        for (int i = 0; i < resumos.length; i++) {
            if (this.resumos[i] != null && this.resumos[i].getTema().equals(tema)) {
                this.resumos[i] = new Resumo(tema, conteudo);
            }
        }
    }

    public String[] pegaResumos() {
        String[] resumosConteudos = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            resumosConteudos[i] = resumos[i].getTema() + ": " + resumos[i].getConteudo();
        }
        return resumosConteudos;
    }

    public String imprimeResumos() {
        return Arrays.toString(resumos);
    }

    public int conta() {
        return resumos.length;
    }

   public boolean temResumo(String tema) {
        for(int i = 0; i < resumos.length; i++){
            if(resumos[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
   }

}
