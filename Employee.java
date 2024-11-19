
public class Employee {
    public static int count = 0;
    public String name;
    public int age;
    public String designation;
    public double salary;
    
    
    Employee(String name,int age,String designation,double salary){
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        count++;
        
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Designation:"    +designation);
        System.out.println("Salary:"+salary);
    }
    
    
}
