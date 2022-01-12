package players.combat;

public enum Shield {
    ROUND(10),
    GREATSHIELD(20);

    private final int damageReduction;

    Shield(int damageReduction){
        this.damageReduction = damageReduction;
    }

    public int getSheildDamageReduction(){
       return this.damageReduction;
    }

}
