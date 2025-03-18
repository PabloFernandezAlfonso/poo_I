/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _7_aparatos;

/**
 *
 * @author manana
 */
public class Dispositivo2 {
    private String modelo;
    private int horasDeUso;
    private boolean encendido;
    private int limiteHorasUso;

    public boolean isEncendido() {
        return encendido;
    }
    
    
    public Dispositivo2(String modelo, int limiteHorasUso) {
        this.modelo = modeloOk(modelo) ? modelo : "Generico";
        horasDeUso = horasDeUso > 0 ? horasDeUso : 0;
        this.limiteHorasUso = limiteHorasUso < 1000 ? 1000 : limiteHorasUso;
        encendido = false;
    }
    public Dispositivo2() {
        this("Generico", 10_000);
    }
    public Dispositivo2(Dispositivo2 copia) {
        modelo = copia.modelo;
        horasDeUso = copia.horasDeUso;
        encendido = copia.encendido;
        limiteHorasUso = copia.limiteHorasUso;
    }

    // Métodos privados
    private static boolean modeloOk(String modelo){
        if(modelo.length() > 15) return false;
        for(char c :modelo.toCharArray()){
            if(c > 'a' && c <= 'z' || c > 'A' && c <= 'Z' || c > '0' && c <= '9' ) 
                continue;
            return false;
        }   
        return true;
    }
    
   
    public void show() {

        System.out.printf("Modelo: %s / Hora de Uso %d / Encendido %b / Limite horas uso: %d.%n", modelo, horasDeUso, encendido, limiteHorasUso);

    }

    public boolean encender() {
        if (!encendido) {
            encendido = true;
            return true;
        }
        return false;
    }

    public boolean apagar() {
        if (encendido) {
            encendido = false;
            return true;
        }
        return false;
    }

    public boolean registrarUso(int horas) {
        if (encendido && (horasDeUso + horas) > limiteHorasUso) {
            horasDeUso = limiteHorasUso;
            return true;
        } 
        horasDeUso += horas;
        return false;
    }

    public boolean requiereMantenimiento() {
        return horasDeUso >= limiteHorasUso * 0.8;
    }

    public boolean reiniciarUso() {
        if (!encendido && horasDeUso == limiteHorasUso) {
            horasDeUso = 0;
            return true;
        } 
        return false;
    }

}
