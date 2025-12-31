package eLearningPertemuan11.Enumery;

enum Level {
    BEGINNER(0),
    INTERMEDIATE(100),
    EXPERT(500);

    private int points;

    Level(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}

public class MainEnum {
    public static void main(String[] args) {

        Level userLevel = Level.INTERMEDIATE;

        System.out.println("User level: " + userLevel);
        System.out.println("Points required: " + userLevel.getPoints());

        System.out.println("All Levels:");
        for (Level level : Level.values()) {
            System.out.println(level + " requires " + level.getPoints() + " points.");
        }
    }
}
