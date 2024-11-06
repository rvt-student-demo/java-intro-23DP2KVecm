package lv.rvt;

public class Agent{
    private String firstName;
    private String lastName;
    
    public Agent(String FirstName, String LastName){
        this.lastName = LastName;
        this.firstName = FirstName;
    }
    public String toString(){
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
}
