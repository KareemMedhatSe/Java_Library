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
public class professor extends user{
    
    String Degree;
    int borrowed_books=0;
    final int maxNumofBooks=5 ;
    boolean canborrow=true;
    professor(String Fname,String Lname,String Address,int Phone_number,String Faculty,int ID,String Degree){
super( Fname,Lname, Address, Phone_number,Faculty,ID);
this.Degree=Degree;
    
    
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public int getBorrowed_books() {
        return borrowed_books;
    }

    public void setBorrowed_books(int borrowed_books) {
        this.borrowed_books = borrowed_books;
    }

    public boolean isCanborrow() {
        return canborrow;
    }

    public void setCanborrow(boolean canborrow) {
        this.canborrow = canborrow;
    }
    @Override
    public boolean borrow(){if(borrowed_books<maxNumofBooks){canborrow=true;}
    
    else{ canborrow=false;}
    return canborrow;
    }
    public void borrownow(){borrowed_books++;}

   
      public void Showinfo()
     {
         System.out.println(" Name: "+this.getFname()+" "+ this.Lname);
    System.out.println("address : "+this.Address);
    System.out.println("phone number : "+this.Phone_number);
    System.out.println("Faculty: "+this.Faculty);
    System.out.println("ID:  "+this.ID);
    System.out.println("Academic Degree: "+this.Degree);

     }
        public void  return_abook (){borrowed_books--;};
}
