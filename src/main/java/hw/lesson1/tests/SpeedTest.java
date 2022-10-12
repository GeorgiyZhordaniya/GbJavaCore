package hw.lesson1.tests;

import hw.lesson1.Person;

public class SpeedTest implements Tests {

    private int minSpeed = 50;

    public SpeedTest() {}

    public SpeedTest(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    @Override
    public void doTest(Person person) {
        if (person.getSpeedStat()>= minSpeed)
            person.setSpeedCheck(true);
        else
            person.setSpeedCheck(false);
    }
}
