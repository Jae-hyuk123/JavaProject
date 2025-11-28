/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

import java.io.Serializable;

/**
 *
 * @author marti
 */
public abstract class Business implements Serializable{

    //Variables
    protected String businessType;
    protected String businessName;
    protected String industry;
    protected int numOfStaff;
    protected String shortTermGoals;
    protected String longTermGoals;

    //default constructor
    public Business() {
        businessType = "";
        businessName = "";
        industry = "";
        numOfStaff = 0;
        shortTermGoals = "";
        longTermGoals = "";
    }

    //overloaded constructor
    public Business(String businessType, String businessName, String industry, int numOfStaff, String shortTermGoals, String longTermGoals) {
        this.businessType = businessType;
        this.businessName = businessName;
        this.industry = industry;
        this.numOfStaff = numOfStaff;
        this.shortTermGoals = shortTermGoals;
        this.longTermGoals = longTermGoals;

    }
    //getters and setters for each variable

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

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

    public String getShortTermGoals() {
        return shortTermGoals;
    }

    public void setShortTermGoals(String shortTermGoals) {
        this.shortTermGoals = shortTermGoals;
    }

    public String getLongTermGoals() {
        return longTermGoals;
    }

    public void setLongTermGoals(String longTermGoals) {
        this.longTermGoals = longTermGoals;
    }
    //this is so i can display all the details of the different classes
    //had to use abstract class for business template so i could use getdetails method for each seperate business type other wise i was not able to get individual variables for example owner. ceo etc

    public abstract String getDetails();

}
