/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _7_aparatos;

/**
 *
 * @author manana
 */
public class TestDispositivo2 {
      public static void main(String[] args) {

        Dispositivo2[] Lista = {
            new Dispositivo2("RELOJ-01", 10000),
            new Dispositivo2("TABLET-X", 15000),
            new Dispositivo2(),
            new Dispositivo2("LAPTOP-PRO", 8000),
            new Dispositivo2("GENéRICO", 12000),
        };

        System.out.println("2.--------------------------------------------------------------------------");
        for (Dispositivo2 d : Lista) {
            System.out.println(d.isEncendido());
        }
        System.out.println("3.--------------------------------------------------------------------------");
        for (int i = 0; i < Lista.length; i++) {
            Lista[i].encender();
        }
        System.out.println("4.--------------------------------------------------------------------------");
        for (Dispositivo2 d : Lista) {
            d.registrarUso(1000);
            d.show();
        }
        System.out.println("5. Creo que es más sencillo el foreach siempre que sea para leer arrays ya que simplifica el código.(Leer comentario del ejercicio)");
        //Como nuestro valor de horas de uso no cumple el requisito en ninguno, no saldrá nada, si se aumenta el numero del apartado 4 se podrá comprobar de forma fácil.
        for (Dispositivo2 d : Lista) {
            if (d.requiereMantenimiento()) {
                d.show();
            }
        }
        System.out.println("6.--------------------------------------------------------------------------");
        for (Dispositivo2 d : Lista) {
            d.apagar();
            if(d.reiniciarUso() == true){;
            d.show();
            }
        }

    }

}
