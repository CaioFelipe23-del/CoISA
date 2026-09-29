package lab2;

public class Descanso {
    private int horasDescanso;
    private int numSemana;

    public int defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
        return horasDescanso;
        }

        public int defineNumeroSemanas(int numSemana) {
        this.numSemana = numSemana;
        return numSemana;
    }

    public String getStatusGeral() {
        int status = horasDescanso/numSemana;

        if (status >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
