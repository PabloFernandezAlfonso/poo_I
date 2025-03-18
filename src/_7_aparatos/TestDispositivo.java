/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _7_aparatos;

/**
 *
 * @author manana
 */
public class TestDispositivo {

    public static void main(String[] args) {

        Dispositivo d1 = new Dispositivo("RELOJ-01", 10000);
        Dispositivo d2 = new Dispositivo("TABLET-X", 15000);
        Dispositivo d3 = new Dispositivo();
        Dispositivo d4 = new Dispositivo("LAPTOP-PRO", 8000);
        Dispositivo d5 = new Dispositivo("GENéRICO", 12000);
        Dispositivo[] Lista = {d1, d2, d3, d4, d5};

        System.out.println("2.--------------------------------------------------------------------------");
        for (Dispositivo d : Lista) {
            d.show();
        }
        System.out.println("3.--------------------------------------------------------------------------");
        for (int i = 0; i < Lista.length; i++) {
            Lista[i].encender();
            Lista[i].show();
        }
        System.out.println("4.--------------------------------------------------------------------------");
        for (Dispositivo d : Lista) {
            d.registrarUso(1000);
            d.show();
        }
        System.out.println("5. Creo que es más sencillo el foreach siempre que sea para leer arrays ya que simplifica el código.(Leer comentario del ejercicio)");
        //Como nuestro valor de horas de uso no cumple el requisito en ninguno, no saldrá nada, si se aumenta el numero del apartado 4 se podrá comprobar de forma fácil.
        for (Dispositivo d : Lista) {
            if (d.requiereMantenimiento() == true) {
                d.show();
            }
        }
        System.out.println("6.--------------------------------------------------------------------------");
        for (Dispositivo d : Lista) {
            d.apagar();
            if(d.reiniciarUso() == true){;
            d.show();
            }
        }

    }

}
