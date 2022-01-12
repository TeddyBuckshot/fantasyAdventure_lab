package rooms.challenege;

public class Treasure implements IChallenge {

    private String name;
    private int points;

    public Treasure(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
