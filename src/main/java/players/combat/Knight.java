package players.combat;

import players.Armour;
import players.Character;
import players.Weapon;
import players.combat.Shield;
import rooms.challenege.Troll;

public class Knight extends Character {

    private Shield shield;


    public Knight(String name, Weapon weapon, Armour armour, int health, int defence, int points){
        super(name, weapon, armour, health, defence, points);
        this.shield = null;
    }

    public void attack(Character troll) {
        troll.defend(getWeaponDamageValueFromEnum());
    }

    public Shield getShield() {
        return this.shield;
    }

    public void changeShield(Shield shield){
        this.shield = shield;
        updateDefence(this.shield);
    }

    public void updateDefence(Shield shield){
        int newDefence = getDefence() + shield.getSheildDamageReduction();
        setDefence(newDefence);
    }

    public void defend(int damage) {
        if (damage > getDefence()) {
            int damageDone = damage - getDefence();
            setHealth(getHealth() - damageDone);
        }
    }
}
