/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

/**
 *
 * @author marti
 */
public class LLC extends Business{
    //declare variables
    private String ceo;
    private int numOfBoardMembers;
    
    
    
    //overloaded constructor
    public LLC(String ceo, String businessName, String industry, int numOfStaff, int numOfBoardMembers){
        super(businessName, industry, numOfStaff);
        this.ceo = ceo;
        this.numOfBoardMembers = numOfBoardMembers;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public int getNumOfBoardMembers() {
        return numOfBoardMembers;
    }

    public void setNumOfBoardMembers(int numOfBoardMembers) {
        this.numOfBoardMembers = numOfBoardMembers;
    }
    
    //might add will come back to it later
    /*@Override
    public double revenue(){
        return revenue;
    }*/
    
}
