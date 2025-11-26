/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

/**
 *
 * @author marti
 */
public class Business {
    
    //Variables
    private String businessName;
    private String industry;
    private int numOfStaff;
    
    
    //default constructor
    public Business(){
        businessName = "";
        industry = "";
        numOfStaff = 0;
    }
    
    //overloaded constructor
    public Business(String businessName, String industry, int numOfStaff){
        this.businessName = businessName;

        this.industry = industry;
        this.numOfStaff = numOfStaff;
        
    }
    //getters and setters for each variable
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }


    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getNumOfStaff() {
        return numOfStaff;
    }

    public void setNumOfStaff(int numOfStaff) {
        this.numOfStaff = numOfStaff;
    }
    
}
