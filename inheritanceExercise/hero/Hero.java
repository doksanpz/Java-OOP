package inheritanceExercise.hero;

public class Hero {
    private String username;
    private int levels;

    public Hero(String username, int levels) {
        this.username = username;
        this.levels = levels;
    }

    public String getUsername() {
        return username;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level %s", this.getClass().getName(), getUsername(), getLevels());
    }
}
