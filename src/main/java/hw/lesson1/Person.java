package hw.lesson1;

public class Person {
    private String name;
    private int speedStat;
    private int strengthStat;
    private boolean speedCheck;
    private boolean strengthCheck;

    public Person(String name, int speedStat, int strengthStat) {
        this.name = name;
        this.speedStat = speedStat;
        this.strengthStat = strengthStat;
    }

    public String getName() {
        return name;
    }

    public int getSpeedStat() {
        return speedStat;
    }

    public int getStrengthStat() {
        return strengthStat;
    }

    public boolean isSpeedCheck() {
        return speedCheck;
    }

    public boolean isStrengthCheck() {
        return strengthCheck;
    }

    public void setSpeedCheck(boolean speedCheck) {
        this.speedCheck = speedCheck;
    }

    public void setStrengthCheck(boolean strengthCheck) {
        this.strengthCheck = strengthCheck;
    }
}

