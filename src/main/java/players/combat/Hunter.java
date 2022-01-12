package players.combat;

import players.Armour;
import players.Character;
import players.Weapon;

public class Hunter extends Character {

    public Hunter(String name, Weapon weapon, Armour armour, int health, int defence) {
        super(name, weapon, armour, health, defence);
    }

    public void attack(Character troll) {
        getWeaponDamageValueFromEnum();
    }

    public void defend(int damage) {
        if (damage > getDefence()) {
            int damageDone = damage - getDefence();
            setHealth(getHealth() - damageDone);
        }
    }
}
