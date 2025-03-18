
package _2_vehiculo;

/**
 *
 * @author manana
 */
public class Vehiculo2 {

    int x;
    int tirada;
    double velocidad;
    String color;
    String marca;
    String tipo;
    byte numRuedas;
    boolean nuevo;
    double kms;
    String[] historicoColores; // máximo 5
    double precio;

    public Vehiculo2(String color, String marca, byte numRuedas, double precio) {
        // tengo ya el this con los valores por defecto
        x = 0;
        velocidad = 0;
        this.color = color;
        this.marca = marca == null ? "Seat" : marca; // Seat si no hay marca

        this.numRuedas = numRuedas < 2 ? 2 : numRuedas;

        switch (this.numRuedas) {
            case 2:
                tipo = "Moto";
                break;
            case 3:
                tipo = "Triciclo";
                break;
            case 4:
                tipo = "Coche";
                break;
            case 10:
                tipo = "Autobús";
                break;
            default:
                tipo = "Camión";
        }

        nuevo = true;
        kms = 0;
        historicoColores = new String[5];
        if (this.color != null) {
            historicoColores[0] = this.color;
        }
        this.precio = precio < 100 ? 100 : precio;
    }

    public Vehiculo2(Vehiculo2 v, double precio) {
        this(v.color, v.marca, v.numRuedas, precio);
    }

    public Vehiculo2() {
        velocidad = 0;
        color = "blanco";
        marca = "Seat";
        tipo = "Coche";
        numRuedas = 4;
        nuevo = true;
        kms = 0;
        historicoColores = new String[5];
        precio = 100;
    }

    public Vehiculo2(Vehiculo2 v) {
        x = 0;
        velocidad = v.velocidad;
        color = v.color;
        marca = v.marca;
        tipo = v.tipo;
        numRuedas = v.numRuedas;
        nuevo = v.nuevo;
        kms = v.kms;
        historicoColores = v.historicoColores;
        precio = v.precio;
    }

    public Vehiculo2 pintar(String color) {
        return null;
    }

    // se llama pintar y coge el vehículo sobre el que aplica cambia a color blanco
    public Vehiculo2 pintar() {
        color = "blanco";

        for (int i = 0; i < historicoColores.length; i++) {
            if (historicoColores[i] == null) {
                historicoColores[i] = color;
                break;
            }
        }

        return this;
    }

    public void lista() {

    }

    public Vehiculo2 juega() {
        tirada = (int) Math.floor(Math.random() * 10 + 1);
        boolean i = true;
        x = x + tirada;
        if (x <= 50) {
            System.out.printf("Tu posición actual es: %d%n", x);
        } else if (x >= 50) {
            System.out.println("Has conseguido 50 puntos, has ganado");
            i = false;
        } else if (i == false) {
            System.out.println("Ya has ganado");
        }
        return this;
    }

    public Vehiculo2 juegaMas() {
        boolean extra = true;
        for (int i = 0; i <= 21; i++) {
            tirada = (int) Math.floor(Math.random() * 10 + 1);
            x = x + tirada;
            if (x <= 50) {
                System.out.printf("Tu posición actual es: %d%n", x);
            } else if (x >= 50) {
                System.out.println("Has conseguido 50 puntos, has ganado");
                extra = false;
                break;
            }
        }
        return this;
    }

    /*public Vehiculo2 pintarBasadoEn(Vehiculo2 vehiculo){
          
          return vehiculo == null ? return : pintar(vehiculo.color);
      } 
     
   public void show(){
        System.out.printf("%f / %s / %s / %s / %x / %b / %f / %s / %f%n",velocidad,color,marca,tipo,numRuedas,nuevo, kms,historicoColores, precio);
    }*/
    public void show() {
        System.out.printf("%s %s %s %s de %x ruedas con %.2f kms a %.2f km/h de precio %.2f ", tipo, marca, color, nuevo ? "nuevo" : "usado", numRuedas, kms, velocidad, precio);
        System.out.print("historial de colores: [");
        
        int hastaAqui = 0;
        /*  for (String c : historicoColores) {
            hastaAqui = (c != null ? hastaAqui: hastaAqui++);
            
          for (int i = 0; i < 5; i++) {
           
            System.out.print(historicoColores[i] + " / ");
            System.out.print(hastaAqui);
            
         } 
        }*/
        for (int i = 0; i < hastaAqui; i++) {

            if (historicoColores[i] != null) {
                 // System.out.print(historicoColores[i]);
               hastaAqui++;
               System.out.print(historicoColores[i] + " / ") ;
               break;
               
            } 
            System.out.print(historicoColores[i] + ((i ==  (historicoColores.length - 1)) ?  "": "/"));
        } 
        System.out.print(hastaAqui);

        System.out.println("].");
    }

   // public void sePuedePintar() {

    

        public static void main(String[] args) {
        Vehiculo2 v1 = new Vehiculo2("rojo", "citroen", (byte) 2, 10);
        Vehiculo2 v2 = new Vehiculo2(v1, 2000);
          
        v1.pintar().pintar().pintar().pintar().show();
        v2.pintar().show();
        //v3.pintarBasadoEn(v2);
        v2.juega().juega();

    }
    
}
