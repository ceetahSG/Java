
public class Student {
    public static int count = 0;
    
    int id;
    String name;
    String dep;
    double cgpa;
    public static String university = "University Of libral Arts";
    
    Student(int id,String name,String dep,double cgpa){
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.cgpa = cgpa;
        count++;
    }
    public void display(){
        System.out.println("ID:"+id);
        System.out.println("NAME:"+name);
        System.out.println("Department:"+dep);
        System.out.println("CGPA:"+cgpa);
        System.out.println("University:"+university);
        System.out.println("");
    }
    
    
}
