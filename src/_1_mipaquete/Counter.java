/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_mipaquete;


public class Counter {

    private int value = 0;
    private int maxValue = 100_000;
    private String model = "N-COUNTER";
    private static String counterEnEsperanto = "ohmm";
    private static int numeroCounter = 0;

    public static String getCounterEnEsperanto() {
        return counterEnEsperanto;
    }
    
    public void setMaxValue(int maxValue) {
        
        this.maxValue = maxValue < 100 ? 100 : maxValue;
    }
    

    public String getModel() {
        return model;
    }

        public Counter() {
        numeroCounter++;
        }
    
        
        public Counter(int maxValue){
            this.maxValue = maxValue < 100 ? 100 : maxValue;
            numeroCounter++;
        }
        public Counter(int maxValue, String model){
            this.maxValue = maxValue < 100 ? 100 : maxValue;
            numeroCounter++;
            this.model = model;
        }
        public Counter(Counter c){
            value = c.value;
            maxValue = c.maxValue;
            model = c.model;
            numeroCounter++;
        }
        
        
        public boolean increment(){
            if(value < maxValue){
                value++;
                return true;
            }
            else{
                return false;
            }
            
        }
        
        public boolean increment(int n){
            if(value < maxValue){
                value+= n;
                return true;
            }
            else{
                return false;
            }
        }
        
        public boolean reset(){
            if(value == maxValue){
                value = 0;
                return true;
            }
            else{
                return false;
            }
        }
        
        public void show(){
        }
        
        public void showEnEperanto(){
            System.out.printf("%s modelo (%s) y valor %d de %d.%n", Counter.counterEnEsperanto, this.model, this.value, this.maxValue);
            
        }
        public void showNum(){
            System.out.printf("%d", numeroCounter);
            
        }
        public static String comoSeDiceShowEnEsperanto(){
            return counterEnEsperanto;
        }
        
        public static void main(String[] args) {
        
            Counter c1 = new Counter();
            Counter c2 = new Counter(-100);
            Counter c3 = new Counter(100, "Modelo");
            Counter c4 = new Counter(c1);
            
            Counter[] counters = {c1, c2, c3, c4};
            for(Counter counter: counters){
                counter.show();
            }
            
            System.out.println("----------------------------------------------------------------");
            
            
            for(int i = 0; i < 100_000; i++){
                c2.increment();
            }
            
            /*c2.show();
            System.out.println(c2.increment());
            c2.show();
            c2.show();
            System.out.println(c2.reset());
            c2.show();
            
            c3.show();
            System.out.println(c3.reset());
            System.out.println(c3.increment());
            c3.show();*/
            c2.showNum();
            
            
            
        }
    
    
    
}
