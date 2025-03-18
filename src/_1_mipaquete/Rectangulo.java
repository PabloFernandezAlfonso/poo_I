/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_mipaquete;

public class Rectangulo {
    int base;
    int altura;
    String color;
    
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 2, "rojo");
        Rectangulo r2 = new Rectangulo(5, 2);
        Rectangulo r3 = new Rectangulo();

        System.out.printf("Rectangulo %s de %d x %d%n", 
                r1.color, r1.base, r1.altura);
        System.out.printf("Rectangulo %s de %d x %d%n", 
                r2.color, r2.base, r2.altura);
        System.out.printf("Rectangulo %s de %d x %d%n", 
                r3.color, r3.base, r3.altura);
    }
    public Rectangulo(int base, int altura, String color){
        this. base = base;
        this.altura = altura;
        this.color = "blanco";
    }        
    
    public Rectangulo(int base, int altura){
        this(base, altura, "blanco");
    }   
        public Rectangulo(){
        this(1, 1, "blanco");
    }    
    
}
