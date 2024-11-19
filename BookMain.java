
public class BookMain {
    public static void main(String[] args){
        Book b1 = new Book("The Alchemist","Paulo coelho","2002","Fiction");
        b1.display();
        System.out.println("Total Books:"+Book.count);
         
    }
}
