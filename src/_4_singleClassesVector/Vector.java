
package _4_singleClassesVector;


public class Vector {
    
    int x;
    int y;

    public Vector() {
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Vector(int dual){
        x =  dual;
        y =  dual;
    }    
    
    public Vector(Vector v) {
        v.x = x;
        v.y = y;
    }
    
    public Vector suma(Vector v){
         return this;
    }
    
    public static void main(String[] args) {
        
        Vector v1 = new Vector();
        Vector v3 = new Vector(0);
        Vector v4 = new Vector(0, 0);
        /*Vector v5 = v1.suma(v3);
        
        new Vector(Integer.MAX_VALUE).suma(new Vector(5)).show();
        System.out.println(Integer.MAX_VALUE);
        */
        
        
    }
    
}
