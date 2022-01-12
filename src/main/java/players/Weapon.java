package players;

public enum Weapon {
    SWORD(10),
    AXE(20),
    WAND(5),
    CROSSBOW(15),
    CLUB(25);

    public final int damage;

    Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}



