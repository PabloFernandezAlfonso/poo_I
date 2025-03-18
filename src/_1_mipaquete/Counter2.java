/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_mipaquete;

/**
 *
 * @author manana
 */
public class Counter2 {
    
    int value;
    int maxValue = 100_000;
    String model = "N-COUNTER";;
    
    public Counter2(){
    }
    public Counter2(int maxValue){
        this.maxValue = maxValue < 100 ? 100 : maxValue;
    }
    public Counter2(int maxValue, String model){
        this.maxValue = maxValue < 100 ? 100 : maxValue;
        this.model = model;
    }
    public Counter2(Counter2 c){
        value = c.value;
        maxValue = c.maxValue;
        model = c.model;
    }
    
    public boolean increment(){
            boolean puedoIncrementar = value < maxValue;
            value = puedoIncrementar ? value++ : value;
            return puedoIncrementar;
        
        /*
         if(value < maxValue){
            //incrementa
            value++;
            return true;
        }
        else{
            //no incrementa
            return false;
        }
        */
    }
    
    public boolean increment(int n){
        if(value + n <= maxValue){
               // incrementa en n
               value += n;
               return true;
           }
           else{
               // llega al máximo perdiendo algún incremento
               value = maxValue;
               return false;
           }
    }
    
    public void show(){
        System.out.printf("Contador: modelo (%s) y valor %d de %d.%n", model, value, maxValue);
    }
   
    public static void main(String[] args) {
         //Probando constructores
         Counter2 c1 = new Counter2();
         Counter2 c2 = new Counter2(-200_000);
         Counter2 c3 = new Counter2(300_000, "Counter");
         Counter2 c4 = new Counter2(c3);
        //Arrays ede counderes diversos
        Counter2[] counters = {c1, c2, c3, c4};
        //Mostrar counters
                for(Counter2 counter: counters){
                            counter.show();
                }
         //Probando increment()
         c1.show();
         for(int i = 0; i < 100_000; i++){
            c1.increment();
         }
         System.out.println(c1.increment());
         c1.show();
         //Probando increment(int n)
         c2.show();
         System.out.println(c2.increment(50));
         c2.show();
         System.out.println(c2.increment(40));
         c2.show();
         System.out.println(c2.increment(20));
         c2.show();
          //Probando reset()
         c2.show();
         System.out.println(c2.reset());
         c2.show();
         c4.show();
         System.out.println(c4.reset());
         c4.show();
    }
        

    public boolean reset(){
        if (value == maxValue){
            value = 0;
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
}
