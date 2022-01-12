package players.healers;

public enum HealingSpells {
    MANDRAKEPOTION(25),
    EMENDO(20),
    ANAPNEO(10),
    EPISKEY(15);

    private final int healingPower;

    HealingSpells(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return this.healingPower;
    }

}
