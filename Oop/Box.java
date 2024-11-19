
package Oop;

public class Box {
    double height;
    double width;
    double depth;
    
    Box(double height,double width,double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        
    }
    public void displayVol(){
        System.out.println("Volume:"+height*width*depth);
    }
         
    
}
