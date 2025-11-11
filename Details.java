/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vote;

/**
 *
 * @author moise
 */
import javax.swing.JOptionPane;
public class Details {
    // variables
    protected String firstName, lastName, eMail, id, password,sex,phoneNum,address;
    protected int age;
    
    // constructor
    public Details(String firstName, String lastName, String eMail, String id, String password,String sex,String phoneNum,String address,int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.id = id;
        this.password = password;
        this.sex=sex;
        this.phoneNum=phoneNum;
        this.address=address;
        this.age=age;
        if(!validation())
        {
            throw new IllegalArgumentException("Invalid Input");
        }
    }
    
    public boolean validation()
    {
        if(firstName == null || firstName.length() < 2)
        {
            JOptionPane.showMessageDialog(null, "Invalid First Name");
            return false;
        }
        else if(lastName == null || lastName.length() < 2)
        {
            JOptionPane.showMessageDialog(null, "Invalid Last Name");
            return false;
        }
        else if(eMail == null || eMail.length() < 2)
        {
            JOptionPane.showMessageDialog(null, "Invalid E-Mail");
            return false;
        }
        else if(id == null || id.length() < 5)
        {
            JOptionPane.showMessageDialog(null, "Invalid ID");
            return false;
        }
        else if(password == null || password.length() < 5)
        {
            JOptionPane.showMessageDialog(null, "Invalid Password");
            return false;
        }
          else if(sex == null || sex.length() < 5)
        {
            JOptionPane.showMessageDialog(null, "Invalid sex");
            return false;
        }
          else if(phoneNum == null || phoneNum.length() > 10)
        {
            JOptionPane.showMessageDialog(null, "Invalid phone Number");
            return false;
        }
          else if(address == null || address.length() < 5)
        {
            JOptionPane.showMessageDialog(null, "Invalid address");
            return false;
        }
          else if(age < 0)
        {
            JOptionPane.showMessageDialog(null, "Invalid age");
            return false;
        }
        
        return true;
    }
    
    // getter
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEMail() { return eMail; }
    public String getId() { return id; }
    public String getPassword() { return password; }
    
    public String getSex(){
        return sex;
    }
   
    public String getPhoneNum(){
        return phoneNum;
    }
   
    public String getAddress(){
        return address;
    }
   
    public int getAge(){
        return age;
    }
    
    public String printDetails(){
        return firstName+"\n"+lastName+"\n"+eMail+"\n"+id+"\n"+sex+phoneNum+"\n"+address+"\n"+age;
    }
}
