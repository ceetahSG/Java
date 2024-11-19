
package Oop;

public class StringClass {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Sajim");
        System.out.println(str);
        str.append(" Khalasi");
        System.out.println(str);
        str.delete(2, 5);
        System.out.println(str);
        
    }
    
}
