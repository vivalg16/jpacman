package nl.tudelft.jpacman.level;

public class Health {

    private int healthPoints;

    public Health(int initialHealth) {
        this.healthPoints = initialHealth;
    }

    public void decrementHealthPoint() {
        this.healthPoints--;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
