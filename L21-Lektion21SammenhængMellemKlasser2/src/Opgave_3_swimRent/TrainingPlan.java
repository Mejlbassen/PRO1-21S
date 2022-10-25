package Opgave_3_swimRent;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlan {
    private char level;
    private int weeklyWaterHours;
    private int weeklyStrengthHours;

    // Opgave 1 fredag 05-11-2021
    public final ArrayList<Swimmer> swimmers = new ArrayList<>();


    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char niveau) {
        this.level = niveau;
    }

    public int getWeeklyStrengthHours() {
        return weeklyStrengthHours;
    }

    public void setWeeklyStrengthHours(int weeklyStrengthHours) {
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public int getWeeklyWaterHours() {
        return weeklyWaterHours;
    }

    public void setWeeklyWaterHours(int weeklyWaterHours) {
        this.weeklyWaterHours = weeklyWaterHours;
    }

    // Opgave 1 fredag 05-11-2021
    public ArrayList<Swimmer> getSwimmers() {
        return new ArrayList<>(swimmers);
    }

    public void addSwimmer(Swimmer swimmer) {
        if (!swimmers.contains(swimmer)) {
            swimmers.add(swimmer);
            swimmer.addTrainingPlan(this);
        }
    }

    public void removeSwimmer(Swimmer swimmer) {
        if (!swimmers.contains(swimmer)) {
            swimmers.remove(swimmer);
            swimmer.removeTrainingPlan(this);
        }
    }

}
