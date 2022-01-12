import org.junit.Before;
import org.junit.Test;
import players.Armour;
import players.Weapon;
import players.combat.Hunter;
import players.combat.Knight;
import players.combat.Shield;
import rooms.challenege.Treasure;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Hunter hunter;
    Shield shield1;
    Shield shield2;
    Treasure treasure;

    @Before
    public void before() {
        knight = new Knight("Lancelot", Weapon.SWORD, Armour.PLATE, 100, 100, 0);
        hunter = new Hunter("hunter", Weapon.CROSSBOW, Armour.CHAINMAIL, 100, 200, 0);
        treasure = new Treasure("gold", 150);
        shield1 = Shield.GREATSHIELD;
        shield2 = Shield.ROUND;

    }

    @Test
    public void canAttack(){
        assertEquals(10, knight.getWeaponDamageValueFromEnum());
    }

    @Test
    public void canUpdateDefenceValue() {
        knight.updateDefence(shield2);
        assertEquals(110, knight.getDefence());
    }

    @Test
    public void canChangeShield() {
        knight.changeShield(shield1);
        assertEquals(Shield.GREATSHIELD, knight.getShield());
        knight.changeShield(shield2);
        assertEquals(Shield.ROUND, knight.getShield());
    }

    @Test
    public void canDefend() {
        knight.defend(50);
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void canDefendAndReduceHealth() {
        knight.defend(150);
        assertEquals(50, knight.getHealth());
    }

    @Test
    public void canAttackPlayer(){
        knight.attack(hunter);
        assertEquals(100, hunter.getHealth());
    }

    @Test
    public void canCollectTreasure() {
        knight.collectTreasure(treasure.getPoints());
        assertEquals(150, knight.getPoints());
    }







}
