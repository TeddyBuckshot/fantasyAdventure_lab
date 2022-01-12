package players.magicians;

import players.Armour;
import players.Character;
import players.Weapon;
import players.mythicalCreatures.MythicalCreature;

import java.sql.Array;
import java.util.ArrayList;

public abstract class Magician extends Character {

    private ArrayList<Spells> spells;
    private MythicalCreature mythicalCreature;

    public Magician(String name, Weapon weapon, Armour armour, int health, int defence, int points, MythicalCreature mythicalCreature) {
        super(name, weapon, armour, health, defence, points);
        this.spells = new ArrayList<Spells>();
        this.mythicalCreature = mythicalCreature;
    }

    public Spells chooseSpell(Spells spell) {
        for (Spells currentSpell : spells){
            if (currentSpell == spell){
                return spell;
            }
        }
    }

    public void addSpell(Spells spell) {
        this.spells.add(spell);
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }
}
