/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ABC
 */
public class SignUpSave {
    // variable
    private ArrayList<SignUpValidation> SignUp = new ArrayList<>();
    
    public void addSignUp(SignUpValidation s)
    {
        SignUp.add(s);
        saveSignUpToFile(s);
    }
    
    public void saveSignUpToFile(SignUpValidation s)
    {
        File Directory = new File("users");
        if(!Directory.exists()) // if directory named "users" is not existing, create one
        {
            Directory.mkdir();  // make a directory
        }
        
        // declare objects
        File file;
        FileWriter fw;
        BufferedWriter bw;
       
        // create objects
        try
        {
            file = new File(Directory, "users.txt");
            fw = new FileWriter(file, true);        // true means append
            bw = new BufferedWriter(fw);
            
            // use objects
            bw.write(s.getFirstName() + ", " + s.getLastName() + ", " + s.getEMail() + ", " + s.getId() + ", " + s.getPassword() + ", " + s.getSex() + ", " + s.getPhoneNumber() + ", " + s.getAddress() + ", " + s.getAge() + "\n");
            bw.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
}
