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
    private String firstName, lastName, eMail, id;
    
    // constructor
    public LoginInformation(String firstName, String lastName, String eMail, String id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.id = id;
    }
    
    // getter
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String geteMail() { return eMail; }
    public String getId() { return id; }
}
