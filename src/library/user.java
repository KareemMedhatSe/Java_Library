/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;


public abstract class user extends person {
    String Faculty;
    
    int ID;
    user(String Fname,String Lname,String Address,int Phone_number,String Faculty,int ID){
     super(  Fname,Lname, Address, Phone_number);
   this.Faculty=Faculty;
  
   this.ID=ID;
    
    }
    abstract public boolean borrow();

    public String getFaculty() {
        return Faculty;
    }

    public int getID() {
        return ID;
    }

    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
   public  abstract void  return_abook ();
    
}
