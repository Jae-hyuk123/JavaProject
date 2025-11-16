/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author ABC
 */
public class LoginInformation {
    // variables
    private String firstName, lastName, eMail, id, sex, phoneNumber, address, age;
    
    // constructor
    public LoginInformation(String firstName, String lastName, String eMail, String id, String sex, String phoneNumber, String address, String age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.id = id;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
    }
    
    // getter
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String geteMail() { return eMail; }
    public String getId() { return id; }
    public String getSex() { return sex; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getAge() { return age; } 
}
