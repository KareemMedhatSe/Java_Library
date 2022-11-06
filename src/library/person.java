/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class person {

    String Fname;
    String Lname;
    String Address;
    int Phone_number;
 
   static ArrayList<employee> emp;
    static ArrayList<student> stu;
    static ArrayList<professor> prof;
   static ArrayList<Book> books;

    person() {
        emp = new ArrayList<employee>();
        emp.add(new employee("amr", "medhat", "50 madinaty", 196, 1));
        emp.add(new employee("ahmed", "maged", "3 rehab", 130, 2));
        emp.add(new employee("sara", "ahmed", "10 luxor", 1638, 3));
        emp.add(new employee("Ahmad", "Seif", "6th Of October", 125784563, 4));
        stu = new ArrayList<student>();
        stu.add(new student("Kareem", "Medhat", "elrehab ", 19560, "computer science", 0, 2));
        stu.add(new student("Ahmed", "Fathy", "new Cairo ", 70890, "Mass com", 1, 3));
        stu.add(new student("Ramzy", "Ahmed", "Nasr City ", 197860, "enginering", 2, 1));
        stu.add(new student("Walid", "Fawzy", "Roxcy ", 14603, "economics", 3, 4));
        stu.add(new student("Ziyad", "Ahmed", "Masr el gdeda ", 173015, "Business", 4, 3));
        prof = new ArrayList<professor>();
        prof.add(new professor("Mona", "Hossam", "Rehab City", 124655, "computer science", 0, "dr"));
        prof.add(new professor("Kareem", "Ibrahim", "133 Joomla St", 188885, "economics", 1, "associate"));
        prof.add(new professor("Hoda", "Sharawi", "Zamalek", 194512, "computer science", 2, "emiritus"));
        prof.add(new professor("Murad", "Jamal", "Zamalek", 156892, "business", 3, "dr"));
        prof.add(new professor("Klaus", "Kinkel", "Tagamou", 196542, "mass com", 4, "emiritus"));
        books = new ArrayList<Book>();
        books.add(new Book("Programming For Begginers",  "Mark Paul",2,1));
        books.add(new Book("Topology: An Intro",  "Alexa Feser",3,2));
        books.add(new Book("Psychology: A Deeper Perspective",  "Jurgen Habermas",4,3));
        books.add(new Book("The road ahead",  "Bill Gates",3,4));
        books.add(new Book("The social need for reformation",  "Naom Chomsky",2,5));

        /* FileOutputStream fos = new FileOutputStream("employee.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(emp);
         oos.close();
         fos.close();*/
    }

    public employee employee_check(int id) {

        for (int i = 0; i < emp.size(); i++) {
            employee em = emp.get(i);
            if (id == em.getSsn()) {
                return em;
            }
        }
        return null;
    }

    person(String Fname, String Lname, String Address, int Phone_number) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Address = Address;
        this.Phone_number = Phone_number;
      

    }

    public Book search_book(int isbn) {
       for (int i = 0; i < books.size(); i++) {
            Book book1= books.get(i);
            if (isbn == book1.ISBN) {
                return book1;
            }
        }
        return null;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone_number(int Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhone_number() {
        return Phone_number;
    }

}

