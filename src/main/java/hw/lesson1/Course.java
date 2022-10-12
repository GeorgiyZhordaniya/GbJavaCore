package hw.lesson1;

import hw.lesson1.tests.*;

public class Course {

    private Team team;
    Tests[] courses = new Tests[2];

    public Course(Team team) {
        this.team = team;
        courses[0] = new SpeedTest();
        courses[1] = new StrengthTest();
    }

    public Course(Team team, int minSpeed, int minStrength) {
        this.team = team;
        courses[0] = new SpeedTest(minSpeed);
        courses[1] = new StrengthTest(minStrength);
    }

    public void doIt() {
        for (Person person : team.getPersons()) {
            for (Tests test : courses) {
                test.doTest(person);
            }
        }
    }
}
