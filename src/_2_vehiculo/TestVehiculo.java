/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _2_vehiculo;

/**
 *
 * @author manana
 */
public class TestVehiculo {
    
    

     public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.show();
        Vehiculo v2 = new Vehiculo(v1, 2345);
        v2.show();
        Vehiculo v3 = new Vehiculo(v2);
        v3.show();
        Vehiculo v4 = new Vehiculo("azul", "renault", (byte) 4, 9999);
        v4.acelera().acelera().frena().para().show();
        
        //v1.color = "eres un torpe";
        v1.setVelocidad( -1000);
        v1.show();
        
    }
    
}
