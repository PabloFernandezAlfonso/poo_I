/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_mipaquete;

/**
 *
 * @author manana
 */
public class TestAnimal {
    
     public static void main(String[] args) {
        
            Counter c1 = new Counter();
            Counter c2 = new Counter(-100);
            Counter c3 = new Counter(100, "Modelo");
            Counter c4 = new Counter(c1);
            
            
            //c1.getMaxValue();
            c1.setMaxValue(-1000);
            c1.show();
            
            
            
            
        }
    
    
    
    
}
