/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _7_aparatos;

/**
 *
 * @author manana
 */
public class Dispositivo {

    private String modelo;
    private int horasDeUso;
    private boolean encendido;
    private int limiteHorasUso;

    public Dispositivo(String modelo, int limiteHorasUso) {
        this.modelo = modelo.length() <= 15 ? modelo : "Genérico";
        horasDeUso = horasDeUso > 0 ? horasDeUso : 0;
        this.limiteHorasUso = limiteHorasUso < 1000 ? 10000 : limiteHorasUso;
        encendido = false;
    }

    public Dispositivo() {
        
    }

    public Dispositivo(Dispositivo copia) {
        modelo = copia.modelo;
        horasDeUso = copia.horasDeUso;
        encendido = copia.encendido;
        limiteHorasUso = copia.limiteHorasUso;
    }

    public void show() {

        System.out.printf("Modelo: %s / Hora de Uso %d / Encendido %b / Limite horas uso: %d.%n", modelo, horasDeUso, encendido, limiteHorasUso);

    }

    public boolean encender() {
        if (encendido != true) {
            encendido = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean apagar() {
        if (encendido != false) {
            encendido = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean registrarUso(int horas) {
        if (encendido == true && (horasDeUso + horas) < limiteHorasUso) {
            horasDeUso = horasDeUso + horas;
            return true;
        } else {
            horasDeUso = limiteHorasUso;
            return false;
        }
    }

    public boolean requiereMantenimiento() {
        return horasDeUso > limiteHorasUso * 0.8;
    }

    public boolean reiniciarUso() {
        if (encendido == false && horasDeUso == limiteHorasUso) {
            horasDeUso = 0;
            return true;
        } else {
            return false;
        }
    }

}
