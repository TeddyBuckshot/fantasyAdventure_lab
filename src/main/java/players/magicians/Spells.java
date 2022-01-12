package players.magicians;

public enum Spells {
    EARTH(45),
    ICE(50),
    FIRE(55),
    LIGHTNING(60);

    private final int damage;

    Spells(int damage) {
        this.damage = damage;
    }

    public int getSpellDamage(){
        return this.damage;
    }
}
