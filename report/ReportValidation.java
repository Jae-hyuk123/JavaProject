/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import javax.swing.JOptionPane;

/**
 *
 * @author ABC
 */
public class ReportValidation {
        String type, county, detailedAddress, description, photo;
    
    // constructor
    public ReportValidation(String type, String county, String detailedAddress, String description, String photo)
    {
        this.type = type;
        this.county = county;
        this.detailedAddress = detailedAddress;
        this.description = description;
        this.photo = photo;
        
        if(!validation())
        {
            throw new IllegalArgumentException("Invalid Report data");
        }
    }
    
    // validation
    public boolean validation()
    {
        if(type.equals(" "))
        {
            System.out.println("invalid type");
            JOptionPane.showMessageDialog(null, "Invalid type");
            return false;
        }
        else if(county.equals(" "))
        {
            System.out.println("Invalid county");
            JOptionPane.showMessageDialog(null, "Invalid county");
            return false;
        }
        else if(detailedAddress == null)
        {
            System.out.println("Invalid address");
            JOptionPane.showMessageDialog(null, "Invalid address");
            return false;
        }
        
        return true;
    }
    
    // getter
    public String getType() { return type; }
    public String getCounty() { return county; }
    public String getDetailedAddress() { return detailedAddress; }
    public String getDescription() { return description; }
    public String getPhoto() { return photo; }
}
