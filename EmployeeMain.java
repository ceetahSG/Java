
public class EmployeeMain {
    public static void main(String[] args){
        Employee e1 = new Employee("Rahim",29,"Software Enginner",20000.00);
        Employee e2 = new Employee("Karim",29,"Software Enginner",20000.00);
        Employee e3 = new Employee("Abul",29,"Software Enginner",20000.00);
        Employee e4 = new Employee("Shofiq",29,"Software Enginner",20000.00);
        e1.display();
        System.out.println("");
        e2.display();
        System.out.println("");
        e3.display();
        System.out.println("");
        e4.display();
        System.out.println("Total employee:"+Employee.count);
    }
}
