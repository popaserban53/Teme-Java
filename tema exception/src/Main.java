
import java.util.ArrayList;
import java.util.logging.Logger;

public class Main {
    private static Logger LOGGER = Logger.getLogger(Person.class.getName());

    public static void main(String[] args) {
        addContact("1940707245047", "Serban","Popa","M",1994);

    }

public static void addContact(String id,String firstName, String lastName,String gender,Integer dateOfBirth) {
    ArrayList<Person> list = new ArrayList<>();
    try{
        validatePerson(id,firstName,lastName,gender,dateOfBirth);
        Person pers = new Person(id,firstName,lastName,gender,dateOfBirth);
        list.add(pers);

    } catch(ValidationException e){
        LOGGER.info(e.getMessage());
    }


}


public static void validatePerson(String id, String firstName, String lastName,String gender, Integer dateOfBirth) throws ValidationException{
        if(id.length() == 0){
            throw new ValidationException("A person must have an CNP!");
        }
        else if(id.length() > 13 || id.length() < 13){
            throw new ValidationException("The CNP must be 13 characters long");

        } else if(gender == "m" && id.charAt(0) != 1){
            throw new ValidationException("Your CNP must begin with number 1!");
        } else if(gender == "f" && id.charAt(0) != 2) {
            throw new ValidationException("Your CNP must begin with number 2!");

        }


        if(dateOfBirth < 1900) {
            throw new ValidationException("Date of birth improbable!");
        } else if(dateOfBirth > 2019){
            throw new ValidationException("You weren't born yet!");
    }


}

}

