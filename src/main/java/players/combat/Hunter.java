package players.combat;

import players.Armour;
import players.Character;
import players.Weapon;

public class Hunter extends Character {

    public Hunter(String name, Weapon weapon, Armour armour, int health, int defence, int points) {
        super(name, weapon, armour, health, defence, points);
    }

    public void attack(Character troll) {
        troll.defend(getWeaponDamageValueFromEnum());
    }

    public void defend(int damage) {
        if (damage > getDefence()) {
            int damageDone = damage - getDefence();
            setHealth(getHealth() - damageDone);
        }
    }
}
