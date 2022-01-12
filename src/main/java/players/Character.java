package players;

import rooms.Room;
import rooms.challenege.IChallenge;
import rooms.challenege.Treasure;

public abstract class Character implements IPlayer{

    private String name;
    private Weapon weapon;
    private Armour armour;
    private int health;
    private int defence;
    private int points;

    public Character(String name, Weapon weapon, Armour armour, int health, int defence, int points){
        this.name = name;
        this.weapon = weapon;
        this.armour = armour;
        this.health = health;
        this.defence = defence;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return this.armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public int getHealth() {
        return this.health;
    };

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefence() {
        return this.defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getArmourDamageReductionFromEnum(){
        return this.armour.getDamageReduction();
    }

    public int getWeaponDamageValueFromEnum() {
        return this.weapon.getDamage();
    }

    public void addPoints(int points){
        this.points +=points;
    }

    public void collectTreasure(int points){
        addPoints(points);
    }



}
