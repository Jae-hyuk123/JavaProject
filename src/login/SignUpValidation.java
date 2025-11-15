/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import javax.swing.JOptionPane;

/**
 *
 * @author ABC
 */
public class SignUpValidation {
    // variables
    private String firstName, lastName, eMail, id, password, sex, phoneNumber, address, age;
    
    // constructor
    public SignUpValidation(String firstName, String lastName, String eMail, String id, String password, String sex, String phoneNumber, String address, String age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.id = id;
        this.password = password;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
        
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
            JOptionPane.showMessageDialog(null, "Invalid ID. ID should be more than 5 characters");
            return false;
        }
        else if(password == null || password.length() < 5)
        {
            JOptionPane.showMessageDialog(null, "Invalid Password. Password should be more than 5 characters");
            return false;
        }
        else if(sex == null){
            JOptionPane.showMessageDialog(null, "Invalid Sex");
            return false;
        }
        else if(phoneNumber == null || phoneNumber.length() < 5)
        {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number. Phone number should be more than 5 digits");
            return false;
        }
        else if(address == null)
        {
            JOptionPane.showMessageDialog(null, "Invalid Address");
            return false;
        }
        else if(age == "select age")
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
    public String getSex() { return sex; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getAge() { return age; }
}
