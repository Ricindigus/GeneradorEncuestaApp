package pe.gob.inei.generadorencuestaapp.pojos;

import java.util.Date;

/**
 * Created by otin016 on 28/06/2017.
 */

public class Visita {
    private int numero;
    private Fecha fecha;
    private Hora horaInicio;
    private Hora horaFin;
    private Fecha fechaPV;
    private Hora horaPV;
    private String resultado;

    public Visita(int numero, Fecha fecha, Hora horaInicio, Hora horaFin, Fecha fechaPV, Hora horaPV, String resultado) {
        this.numero = numero;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.fechaPV = fechaPV;
        this.horaPV = horaPV;
        this.resultado = resultado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Hora horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Hora getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Hora horaFin) {
        this.horaFin = horaFin;
    }

    public Fecha getFechaPV() {
        return fechaPV;
    }

    public void setFechaPV(Fecha fechaPV) {
        this.fechaPV = fechaPV;
    }

    public Hora getHoraPV() {
        return horaPV;
    }

    public void setHoraPV(Hora horaPV) {
        this.horaPV = horaPV;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
