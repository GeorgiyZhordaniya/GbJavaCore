package hw.lesson1.tests;

import hw.lesson1.Person;

public class StrengthTest implements Tests {

    private int minStrength = 50;

    public StrengthTest() {
    }

    public StrengthTest(int minStrength) {
        this.minStrength = minStrength;
    }

    @Override
    public void doTest(Person person){
        if (person.getStrengthStat()>= minStrength)
            person.setStrengthCheck(true);
        else
            person.setStrengthCheck(false);
    }
}
