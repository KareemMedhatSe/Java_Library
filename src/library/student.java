/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;


public class student extends user {
    
    int Year;
    int borrowedbooks=0;
   final int maxNumofBooks=3;
   boolean canborrow=true;
    student(String Fname,String Lname,String Address,int Phone_number,String Faculty,int ID,int Year){
    super(  Fname,Lname, Address, Phone_number,Faculty,ID);
    this.Year = Year;
    
    
    }
    public void Showinfo(){
    System.out.println(" Name: "+Fname+" "+ Lname);
    System.out.println("address : "+Address);
    System.out.println("phone number : "+Phone_number);
    System.out.println("Faculty: "+Faculty);
    System.out.println("ID:  "+ID);
        System.out.println("the year of studying :  "+Year);

    
    }
    
    @Override
    public boolean borrow(){if(borrowedbooks<maxNumofBooks){canborrow=true;}
    
    else{ canborrow=false;}
    return canborrow;
    }
    public void borrownow(){borrowedbooks++;}

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setBorrowedbooks(int borrowedbooks) {
        this.borrowedbooks = borrowedbooks;
    }

    public void setCanborrow(boolean canborrow) {
        this.canborrow = canborrow;
    }

    public int getYear() {
        return Year;
    }

    public int getBorrowedbooks() {
        return borrowedbooks;
    }

    public int getMaxNumofBooks() {
        return maxNumofBooks;
    }

    public boolean isCanborrow() {
        return canborrow;
    }
    
    public void  return_abook (){borrowedbooks--;};
    
}
