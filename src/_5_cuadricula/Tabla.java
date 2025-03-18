/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _5_cuadricula;

/**
 *
 * @author manana
 */
public class Tabla {
    private byte x;
    private byte y;
    private int filaMax;
    private int columnaMax;
    private int[] desplazamientos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public Tabla(byte x, byte y, int filaMax, int columnaMax) {
        this.x = (byte) (x >= columnaMax ? columnaMax : x);
        this.y = (byte) (y >= filaMax ? filaMax : y);
        this.filaMax = filaMax <= 0 ? 5 : filaMax;
        this.columnaMax = columnaMax <= 0 ? 5 : columnaMax;
    }

    public Tabla() {
        this((byte) 0, (byte) 0, 0, 0);
    }

    public Tabla(byte x, byte y) {
        this(x, y, 0, 0);
    }

    public void show() {
        int fila;
        int columna;
        int barras;
        System.out.printf("Tamaño = %d x %d%n", filaMax, columnaMax);
        
        for (fila = 0; fila <= filaMax; fila++) {
            for (columna = 0; columna <= columnaMax; columna++) {
                System.out.print(columna != columnaMax ? "+------" : "+");
            }
            System.out.println("");
            for (barras = 0; barras <= columnaMax; barras++) {
                if (fila <= filaMax - 1) {
                    //System.out.print(barras != columnaMax ? "|      " : "|");
                    if (barras != columnaMax) {
                        if (fila == filaMax / 2 && barras == columnaMax / 2) {
                            for(int i = 0; i < desplazamientos.length; i++){
                            System.out.print("|   "+desplazamientos[i]+"  ");
                            }
                        }
                        else{
                        System.out.print("|      ");
                        }
                    } else {
                        System.out.print("|");
                    }

                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        Tabla t1 = new Tabla((byte) 4, (byte) 5);
        Tabla t2 = new Tabla((byte) 10, (byte) 10, 5, 5);
        Tabla t3 = new Tabla();
        //t3.show();
        //t2.show;
    }

}

