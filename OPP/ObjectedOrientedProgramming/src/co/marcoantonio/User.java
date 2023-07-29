package co.marcoantonio;

public class User {

    //A classe usuario vai armezenar propriedades, metodos e os comportamentos

    private String FirstName;
    private String LastName;


    //Criando o metodo construtor
    public User(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

}
