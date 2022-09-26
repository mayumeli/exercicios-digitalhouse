package Relogio;

import java.util.Calendar;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    public Relogio(int hora, int minuto, int segundo) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida");
        }
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido");
        }
        if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Segundo inválido");
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getRelogioTime() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public static String getHoraAtual() {
        int hours = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int minutes = Calendar.getInstance().get(Calendar.MINUTE);
        int seconds = Calendar.getInstance().get(Calendar.SECOND);
        return hours + ":" + minutes + ":" + seconds;
    }
}
