package co.marcoantonio.caldeira;

public class User {
    private String name;
    private String lastName;

    public User(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public void setName(String name){
        this.name = name;
    };

    public String getName(){
        return name;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getlastName(){
        return lastName;
    }

    public String output() {
        return name.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String output(boolean showLastName) {
       if(showLastName){
           return output();
       }else{
           return name;
       }

    }


}
