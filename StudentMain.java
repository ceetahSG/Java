
import java.util.Scanner;


public class StudentMain {
 
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
    int id;
    String name;
    String dep;
    double cgpa;
    System.out.print("Enter id:");
    id = s.nextInt();
    s.nextLine();
    System.out.print("Enter name:");
    name = s.nextLine();
    System.out.print("Enter Department:");
    dep = s.nextLine();
    System.out.print("Enter cgpa:");
    cgpa = s.nextDouble();
    s.nextLine();
    
    
    Student s1 = new Student(id,name,dep,cgpa);
    s1.display();
    System.out.println("Total Students:"+Student.count);
    
    
        
        
    }
    
}
