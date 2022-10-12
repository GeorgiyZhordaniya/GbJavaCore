package hw.lesson1;

public class MainClass {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("name1",49, 49);
        person[1] = new Person("name2",50, 50);
        person[2] = new Person("name3",49, 51);
        person[3] = new Person("name4",51, 51);

        Team team = new Team("team1", person);

        Course course = new Course(team);

        course.doIt();

        team.showResults();
    }
}