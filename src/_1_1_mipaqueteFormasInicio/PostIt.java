/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_1_mipaqueteFormasInicio;

/**
 *
 * @author manana
 */
public class PostIt {
    int alto;
    int ancho;
    String color;
    String contenido;
    
    public static void main(String[] args) {
       PostIt p1 = new PostIt();
       System.out.printf("Post-It %s de %dx%d en el que pone %s%n",
                p1.color, p1.alto, p1.ancho, p1.contenido);
       p1.alto = 70;
       p1.ancho = 70;
       p1.color = "amarillo";
       p1.contenido = "A";
       
       System.out.printf("Post-It %s de %dx%d en el que pone %s%n",
                p1.color, p1.alto, p1.ancho, p1.contenido);
       p1.contenido = "HOLA RADIOLA";
       System.out.printf("Post-It %s de %dx%d en el que pone %s%n",
                p1.color, p1.alto, p1.ancho, p1.contenido);
       
       PostIt p2 = new PostIt();
      
       p2.alto = 40;
       p2.ancho = 90;
       p2.color = "rojo";
       p2.contenido = "Guay";
       
       System.out.printf("Post-It %s de %dx%d en el que pone %s%n",
                p2.color, p2.alto, p2.ancho, p2.contenido);
       
       
       
       
    }
}
