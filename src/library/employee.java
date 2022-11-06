/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Scanner;

/**
 *
 * @author kareem medhat
 */
public class employee extends person {

    int ssn;

    employee(String Fname, String Lname, String Address, int Phone_number, int ssn) {

        super(Fname, Lname, Address, Phone_number);

        this.ssn = ssn;

    }

    employee() {
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getSsn() {
        return ssn;
    }

    /*browse functions */
    public void browse_prof(professor prof[]) {
        for (int i = 0; i < prof.length; i++) {
            prof[i].Showinfo();
            System.out.println("-----------------");
        }
    }

    public void browse_student(student stu[]) {
        for (int i = 0; i < stu.length; i++) {

            stu[i].Showinfo();
            System.out.println("-----------------");
        }
    }
    /*end of browse functions */

    /*search functions */
    public professor searchprof(int id) {
        person p;

        for (int i = 0; i < prof.size(); i++) {
            professor profe = prof.get(i);
            if (id == profe.getID()) {
                return profe;
            }
        }
        return null;

    }

    public student searchstudent(int id) {
        person p;

        for (int i = 0; i < stu.size(); i++) {
            student s = stu.get(i);
            if (id == s.getID()) {
                return s;
            }
        }
        return null;

    }

    /*end of search functions*/
    /**
     * * Delete Functions: Deletes Object's data from the array **
     */
    boolean deleteBook(int isbn) {
        
          for (int i = 0; i < books.size(); i++) {
            
            if (isbn == books.get(i).ISBN) {
                books.remove(i);
                return true;
            }
        }
        return false;
         
    }

     static boolean deleteProfessor(int id) {
       person p=new person();
          for (int i = 0; i < prof.size(); i++) {
         
            if (id ==prof.get(i).ID) {
              prof.remove(i);
               
                return true;
            }
        }
        return false;
        
    }

     static boolean deleteStudent(int id) {
        person p=new person();
          for (int i = 0; i < stu.size(); i++) {
            
            if (id == stu.get(i).ID) {
                stu.remove(i);
                return true;
            }
        }
        return false;

    }/*end of delete functions*/
    /*update function*/


    public void update_student(int id,String fname,String lname,String adress,int phone ,  String faculty, int year) {
            for (int i = 0; i < stu.size(); i++) {
            student s = stu.get(i);
            if (id == s.getID()) {
               s.Fname=fname;s.Lname=lname;s.Address=adress;s.Phone_number=phone;s.Faculty=faculty;s.Year=year;
            }
        }
       
    }

    public void update_prof(int id,String fname,String lname,String adress,int phone ,  String faculty,String degree) {
           for (int i = 0; i < prof.size(); i++) {
            professor p = prof.get(i);
            if (id == p.getID()) {
               p.Fname=fname;p.Lname=lname;p.Address=adress;p.Phone_number=phone;p.Faculty=faculty;p.Degree=degree;
            }
        }
            
    }
    /*end of update functions */
    /*add book function*/

    public void add_book(String title, String author, int copies) {
        person p;
        books.add(new Book(title, author, copies,books.size()));

    }

}
