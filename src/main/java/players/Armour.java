package players;

public enum Armour {
    ROBES(10),
    CHAINMAIL(20),
    PLATE(30);

    private final int damageReduction;

    Armour(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public int getDamageReduction() {
        return this.damageReduction;
    }

}
