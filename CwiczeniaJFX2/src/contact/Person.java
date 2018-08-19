package contact;

import javafx.beans.property.SimpleStringProperty;

public class Person {

        private final SimpleStringProperty firstname;
        private final SimpleStringProperty lastname;
        private final SimpleStringProperty email;
        
    public Person() {
    this.firstname = new SimpleStringProperty("");
    this.lastname = new SimpleStringProperty("");
    this.email= new SimpleStringProperty("");
    }
        
    public Person(String frname, String ltname, String email) {
        this.firstname = new SimpleStringProperty (frname);
        this.lastname = new SimpleStringProperty (ltname);
        this.email = new SimpleStringProperty (email);
    }
    
    public String getFirstname(){
        return firstname.get();
    }
    
    public void setFirstName(String frname){
        firstname.set(frname);
    }
   
    public String getLastName(){
        return lastname.get();
    }
    
    public void setLastName(String frname){
        lastname.set(frname);
    }
    
    public String getEmail(){
        return email.get();
    }
    
    public void  setEmail(String frname){
        email.set(frname);
    }   
}
