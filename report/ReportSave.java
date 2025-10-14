/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author ABC
 */
public class ReportSave {
    // variable
    private ArrayList<ReportValidation> reports = new ArrayList<>();
    
    public void addReport(ReportValidation r)
    {
        reports.add(r);
        saveReportToFile(r);
    }
    
    public void saveReportToFile(ReportValidation r)
    {
        File dataDir = new File("reports");
        if(!dataDir.exists())
        {
            dataDir.mkdirs();
        }
        
        File file = new File(dataDir, "data.txt");
        
        try(FileWriter writer = new FileWriter(file, true))
        {
            writer.write(r.getType() + ", " + r.getCounty() + ", " + r.getDetailedAddress() + ", " + r.getDescription() + ", " + r.getPhoto() + "\n");
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
}
