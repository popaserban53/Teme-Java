import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Employee("Serban",24,"Strada Soimului nr. 1");
        Person person2 = new Employee("Sergiu",25,"Aleea Baita nr. 3, scara 2, ap. 22");
        Person person3 = new Unemployed("Dani",23,"Strada Viilor nr. 5");

        List<Hobby> hobbies1 = new ArrayList<>();
        Hobby hobby1 = new Hobby("Swimming",3);
        Hobby hobby2 = new Hobby("Hiking",1);
        Hobby hobby3 = new Hobby("Reading",7);
        Hobby hobby4 = new Hobby("Gaming",4);
        Hobby hobby5 = new Hobby("Dancing",3);

        hobbies1.add(hobby1);
        hobbies1.add(hobby2);
        person1.setHobbies(hobbies1);

        List<Hobby> hobbies2 = new ArrayList<>();

        hobbies2.add(hobby4);
        hobbies2.add(hobby5);
        person2.setHobbies(hobbies2);

        List<Hobby> hobbies3 = new ArrayList<>();

        hobbies3.add(hobby3);
        hobbies1.add(hobby1);
        hobbies3.add(hobby5);
        person3.setHobbies(hobbies3);

        HashMap<Person,List<Hobby>> list = new HashMap<>();

        list.put(person1,hobbies1 );
        list.put(person2,hobbies2 );
        list.put(person3, hobbies3);


        System.out.println("==================Hobbies=============================");
        for (Map.Entry<Person, List<Hobby>> entry : list.entrySet()) {
            System.out.println(entry);
        }

        sortByName();
        System.out.println("=============================================");
        sortByAge();

    }

        public static void sortByAge(){

        System.out.println("================Sort by age===================");
        TreeSet<Person> pers = new TreeSet<>(new SortByAge());
        pers.add(new Employee("Alex",27,"Strada Fructelor nr. 28"));
        pers.add(new Student("George",22,"Strada Victoriei nr. 11"));
        pers.add(new Unemployed("Mihai",26,"Strada Malinului nr.3"));

        System.out.println(pers);

    }

        public static void sortByName(){

        System.out.println("========================Sort By Name====================");
        Set<Person> persons = new TreeSet<>(new SortByName());

        persons.add(new Employee("Vlad",19,"Aleea Azuga nr.2, scara 1, ap. 13"));
        persons.add(new Student("Calin",21,"Strada Nicolae Titulescu nr. 25, scara 1, ap 3"));
        persons.add(new Unemployed("Tudor",18,"Strada Tudor Vladimirescu nr.7"));


        for (Person e: persons){
            System.out.println(e.toString());
        }

    }

}
