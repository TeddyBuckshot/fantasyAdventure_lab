package players;

public interface IPlayer {

    Weapon getWeapon();
    void setWeapon(Weapon weapon);
    Armour getArmour();
    void setArmour(Armour armour);
    int getHealth();
    void setHealth(int health);
    int getDefence();
    void setDefence(int defence);
    String getName();
    void setName(String name);

    void attack(Character troll);
    void defend(int damage);

}
