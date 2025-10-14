/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

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
        File dataDir = new File("users");
        if(!dataDir.exists())
        {
            dataDir.mkdir();
        }
        
        File file = new File(dataDir, "users.txt");
        
        try(FileWriter writer = new FileWriter(file, true))
        {
            writer.write(s.getFirstName() + ", " + s.getLastName() + ", " + s.getEMail() + ", " + s.getId() + ", " + s.getPassword() + "\n");
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
}
