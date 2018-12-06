

import java.util.logging.Logger;

public class Person {
    private static Logger LOGGER = Logger.getLogger(Person.class.getName());
    private String cnp;
    private String firstName;
    private String lastName;
    private String gender;
    private Integer birthYear;

    public Person(String cnp, String firstName, String lastName,String gender, Integer birthYear) throws ValidationException{
        this.cnp = cnp;
        this.firstName = firstName;
        this.lastName = lastName;
        if(gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("M")){
            this.gender = gender;
        } else {
            throw new ValidationException("Gender has to be either F or M!");
        }
        this.birthYear = birthYear;
    }

    public String getCnp() {

        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }


    public Integer getBirthYear() {

        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {

        this.birthYear = birthYear;
    }
}
