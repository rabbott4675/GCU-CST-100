import java.util.ArrayList;

public class MyPeople {
	public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<Person>();
        Person tempPerson = new Person();
        String firstName;
        String lastName;
        char choice = 'y';
        int count = 1;

        // fill my ArrayList
        do {
            people.add(tempPerson);
          

            tempPerson.setFirstName(firstName);
            tempPerson.setLastName(lastName);

            count++;

            choice = Util.prompt(
                    "Enter another person? [y or n]: ")
                    .toLowerCase().charAt(0);

        } while (choice == 'y');

        // display my list of people
        for(int i = 0; i < people.size(); i += 1) {
            System.out.print(people.get(i));
        }

    }

}

// my Person class which I am trying to build from
public class Person {

    // instance variables
    private String firstName;
    private String lastName;

    // default constructor
    public Person() {
    }

    public String getFirstName(){
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
}
}
