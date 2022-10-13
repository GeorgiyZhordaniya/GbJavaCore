package hw.lesson1;

public class Team {

    private String name;
    private Person[] persons;

    public Team(String name, Person[] persons) {
        this.name = name;
        this.persons = persons;
    }

    public String getName() {
        return name;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void showResults(){
        System.out.println("Results:");
        for (Person person : persons) {
            System.out.println(person.getName());
            if (person.isSpeedCheck())
                System.out.println("Speed test: passed");
            else if (person.isSpeedCheck() == false)
                System.out.println("Speed test: failed");
            if (person.isStrengthCheck())
                System.out.println("Strength test: passed");
            else if (person.isStrengthCheck() == false)
                System.out.println("Strength test: failed");
        }
    }
}
