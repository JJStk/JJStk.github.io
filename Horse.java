// James Story james.story@malad.us
// borrowing this to use for that class
//Simple horse class created by Kim Gross
//for CTE Software Development class 2022

public class Horse {
    String name;// current name of the horse
    int birthYear;//year the horse was born
    String[] names; //array of old names of the horse
    int numberofNames=0; //how many old names are there.
    public Horse(String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
        horseName = "jeffery";
        year = 1994;
    };
    
    public void age (){
        // unused for now
    }; 
    public void changeName (String newName){//change the name but save the old name
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    }; 
    public String toString (){
        return name;
    };    

    // this should throw error reached end of file without parsing, I don't know how to fix that



}

