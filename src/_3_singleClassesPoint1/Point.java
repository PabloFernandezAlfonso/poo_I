/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _3_singleClassesPoint1;

/**
 *
 * @author manana
 */
public class Point {

    private byte x;
    private byte y;
    private String colour;
    private char symbol;

    public byte getX() {
        return x;
    }

    public byte getY() {
        return y;
    }

    public String getColour() {
        return colour;
    }

    public char getSymbol() {
        return symbol;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(byte x, byte y) {
        this.x = x;
        this.y = y;
    }

    public Point(byte x, byte y, String colour, char symbol) {
        this.x = x;
        this.y = y;
        this.colour = colour;
        this.symbol = symbol;
    }

    public Point(String colour, char symbol) {
        this.colour = colour;
        this.symbol = symbol;
    }

    public void showSimple() {

        System.out.printf("Point %c de color %s (%d, %d)", symbol, colour, x, y);
    }

    public boolean up(byte y) {

        if (this.y > y) {
            return true;
        } else {
            return false;
        }
    }

    public boolean down(byte y) {
        if (this.y < y) {
            return true;
        } else {
            return false;
        }
    }

    public boolean right(byte x) {
        if (this.x > x) {
            return true;
        } else {
            return false;
        }
    }

    public boolean left(byte x) {
        if (this.x < x) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {

        int fila;
        int inicioFila = 7;
        int finalFila = 0;
        int cruz;
        int inicioCruz = 0;
        int finalCruz = 13;
        int palos;
        int inicioPalos = 0;
        int finalPalos = 14;

        for (fila = inicioFila; fila >= finalFila; fila--) {
            System.out.print(fila + " ");
            for (cruz = inicioCruz; cruz < finalCruz; cruz++) {
                if(cruz == 12 && fila == 5){
                    if(cruz < 12){
                    System.out.print("a" + "--");
                    }else{
                    System.out.print("a");
                    }
                }
                else if (cruz != finalCruz - 1) {
                    System.out.print("+--");
                    
                } 
                else {
                    System.out.print("+");
                }
            }
            System.out.println("");
            for (palos = inicioPalos; palos < finalPalos; palos++) {
                if (palos == 0){
                    System.out.print("  ");
                } 
                else if(fila == 0){
                    if(palos < 10){
                    System.out.print(palos - 1 + "  ");}
                    else{
                        System.out.print(palos - 1 + " ");
                    }
                }
                else {
                    System.out.print("|  ");
                }
            }
                System.out.println("");
        }

        /*
        int yfinal = 14;
        int xfinal = 12;
        int contador = 0;
        int menosContador = 7;
        for (int x = 0; x <= xfinal; x++) {

            for (int y = 0; y <= yfinal; y++) {
                if (x % 2 != 0) {
                    
                    if (x == 0) {
                        System.out.print(x + " ");
                    } else if (x == xfinal && y != 0) {
                        System.out.print(" " + contador++ + " ");
                    } 
                    else {
                        if (y == 0) {
                            System.out.print("   ");
                        } else {
                            System.out.print(" | ");
                        }
                    }
                } else if (x % 2 == 0) {
                    if (y == 0) {
                        System.out.print(" " + menosContador-- + " ");
                    } else {
                        System.out.print("-+-");
                    }
                }
            }

            System.out.println("");
        }
         */
    }

    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point("rojo", 'a');
        Point p3 = new Point((byte)6, (byte)3);
        p3.show();
    }

}
