/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author manana
 */
public class Vehiculo {
    
    private String matricula;
    private String tipo;
    private short anoFabricacion;
    private int kilometraje;
    private boolean requiereMantenimiento;


    public Vehiculo(String matricula, String tipo, short anoFabricacion, int kilometraje) {
        this.matricula = validarMatricula(matricula) ? matricula : "DESCONOCIDA";
        this.tipo = tipo.equals("moto") ? "moto" : tipo.equals("camion") ? "camion" :tipo.equals("bicicleta") ? "bicicleta" :"coche";
        this.anoFabricacion = anoFabricacion >= 1990 && anoFabricacion <= java.time.Year.now().getValue() ? anoFabricacion : 0;
        this.kilometraje = kilometraje >= 0 ? kilometraje : 0;
        requiereMantenimiento = false ;
    }

    public Vehiculo(Vehiculo c) {
        this.matricula = c.matricula;
        this.tipo = c.tipo;
        this.anoFabricacion = c.anoFabricacion;
        this.kilometraje = c.kilometraje;
        this.requiereMantenimiento = c.requiereMantenimiento;
    }
   
     private boolean validarMatricula(String matricula) {
         if (matricula.length() > 10 || matricula.length() <= 4) return false;
         for(int i = 0; i < 3 ; i++){
             if (matricula.charAt(i)  >= 'A' && matricula.charAt(i)  >= 'Z') return false;
         }
         for(int i = 0; i < matricula.length() ; i++){
             if (matricula.charAt(i)  >= '0' && matricula.charAt(i)  >= '9') return false;
         }
         return true;
    }
    public void mostrar(){
        System.out.printf("Vehículo [%s] (%s) del año %d con %d km. Requiere mantenimiento: %s.%n", matricula, tipo, anoFabricacion, kilometraje, requiereMantenimiento);
    }
    public boolean actualizarKilometraje(int nuevoKilometraje){
        if (nuevoKilometraje > kilometraje){
            kilometraje = nuevoKilometraje;
            return true;
        } else{
            return false;
        }
    }
    public boolean marcarParaMantenimiento(){
        if (requiereMantenimiento == true){
            return false;
        }else{
            requiereMantenimiento = true;
            return true;
        }
    }
    public int calcularAntiguedad(){
        return java.time.Year.now().getValue() - anoFabricacion;
    }
    public boolean mismaAntiguead(Vehiculo v){
        return calcularAntiguedad() == v.calcularAntiguedad();
    }
    public boolean esIgual(Vehiculo v){
        return matricula.equals(v.matricula) && tipo.equals(v.tipo);
    }
    
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC1234", "moto", (short)2015 , 45000);
        Vehiculo v2 = new Vehiculo(v1);
        
        v1.calcularAntiguedad();
        v1.actualizarKilometraje(100000);
        v1.marcarParaMantenimiento();
        v1.mostrar();
        v2.mostrar();
        
    }
    
}
