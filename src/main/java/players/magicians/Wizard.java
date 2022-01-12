package players.magicians;

import players.Armour;
import players.Weapon;
import players.mythicalCreatures.MythicalCreature;

public class Wizard extends Magician {

    private String name;
    private Weapon weapon

    public Wizard(String name, Weapon weapon, Armour armour, int health, int defence, int points, MythicalCreature mythicalCreature) {
        super(name, weapon, armour, health, defence, points, mythicalCreature);
    }
}
