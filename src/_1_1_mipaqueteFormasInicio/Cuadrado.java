/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_1_mipaqueteFormasInicio;

/**
 *
 * @author manana
 */
public class Cuadrado {
    
    int lado;
    String color;
    int superficie;
    
    public Cuadrado(){
        lado = 1;
        color = "blanco";
        superficie = lado * lado;
    }
    public Cuadrado(int miLado){
        color = "blanco";
        lado = miLado;
        superficie = lado * lado;
    }
    public Cuadrado(String miColor){
        color = miColor;
        lado = 1;
        superficie = lado * lado;
    }
    public Cuadrado(int miLado, String miColor){
        lado = miLado;
        color =  miColor;
        superficie = lado * lado;
    }
    
    public static void main(String[] args) {
  /*     
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado(1);
        Cuadrado c3 = new Cuadrado("blanco");
        Cuadrado c4 = new Cuadrado(1, "blanco");
   */     
        Cuadrado[] cuadrados = {
                new Cuadrado(),
                new Cuadrado(7),
                new Cuadrado("rojo"),
                new Cuadrado(10, "verde"),
        };
        
        for(Cuadrado c: cuadrados){
                    System.out.printf("Cuadrado %s de lado %d con superficie %d.%n", c.color, c.lado, c.superficie);
        }
        
        int totalCuadrados = 100;
        Cuadrado[] cuadrados2 = new Cuadrado[totalCuadrados];
        
        for(int i = 0; i < cuadrados2.length; i++){
            cuadrados2[i] = new Cuadrado(i + 1);
        }
        for(Cuadrado c: cuadrados2){
                    System.out.printf("Cuadrado %s de lado %d con superficie %d.%n", c.color, c.lado, c.superficie);
        }
      
    }
    
}
