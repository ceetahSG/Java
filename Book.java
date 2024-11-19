/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sajim
 */
public class Book {
    public static int count = 0;
    String title;
    String author;
    String year;
    String genre;
    
    Book(String title,String author,String year,String genre){
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        count++;
        
    }
    public void display(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Year:"+year);
        System.out.println("Genre:"+genre);
    }
    
    
    
    
    
}
