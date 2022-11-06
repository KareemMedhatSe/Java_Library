/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Lenovo
 */
public class Book {
    String Title;
     int ISBN;
    String Author;
    int avaliblenum;
    boolean Availability=true;
    static int num=0; 
    Book(String Title,String Author,int avaliblenum,int isbn){
       this.Title = Title;
       
       this.Author = Author;
       this.avaliblenum=avaliblenum;
   ISBN=isbn;
    }
    Book(){}

    
public boolean  borrowrequest(){

    return Availability;
}
public void borrownow(){
if(Availability==true){Availability=false;System.out.println("the book is avaliable and you can borrow now ");}
else System.out.println("sorry this book isn't avaliable now");}

public void showBookinfo(){System.out.println("Book Title: "+Title);
System.out.println("ISBN: "+ISBN);
System.out.println("Author: "+Author);
if(Availability==true){System.out.println("Book is Avaliable");}
else System.out.println("Sorry, the book isn't avaliable");
}

    public void setAvaliblenum(int avaliblenum) {
        this.avaliblenum = avaliblenum;
    }

    public int getAvaliblenum() {
        return avaliblenum;
    }
    
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    

    public String getTitle() {
        return Title;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public boolean isAvailability() {
        return Availability;
    }
    public void returnbook(){Availability=true;}
}
