
package Oop;


public class Student {
    static int count = 0;
    String name,gmail;
    int id;
    
    Student(String name,String gmail,int id){
        this.name = name;
        this.gmail = gmail;
        this.id = id;
        count++;
       
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Email:"+gmail);
    }
    
    
}
