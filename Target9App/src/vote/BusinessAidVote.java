/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vote;

/**
 *
 * @author moise
 */
public class BusinessAidVote extends Vote {

    //variables
    private String aidType;
    //overloaded constructor

    public BusinessAidVote(String aidType, String voterNames, String voterId, String vote, String reason) {
        super(voterNames, voterId, vote, reason);
        this.aidType = aidType;
    }

    //setters
    public void setAidType(String aidType) {
        this.aidType = aidType;
    }
    //getters

    public String getAidType() {
        return aidType;
    }
    //override voteDetails with business aid name

    @Override
    public String voteDetails() {
        return "Vote on Business and Aid support: \n" + aidType + super.voteDetails();
    }
}
