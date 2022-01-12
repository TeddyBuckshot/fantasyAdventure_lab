package players.combat;

import players.Armour;
import players.Character;
import players.Weapon;

public class Archer extends Character {

    public Archer(String name, Weapon weapon, Armour armour, int health, int defence) {
        super(name, weapon, armour, health, defence);
    }


    public void attack(Character troll) {
        getWeaponDamageValueFromEnum();
    }

    public void defend(int damage) {
        int damageDone = damage - getDefence();
    }

    public int specialAttack(){
        return getWeaponDamageValueFromEnum()*2;
    }
}
