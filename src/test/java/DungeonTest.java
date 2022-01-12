import org.junit.Before;
import org.junit.Test;
import players.Armour;
import players.Weapon;
import players.combat.Knight;
import rooms.Dungeon;
import rooms.challenege.Treasure;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Treasure treasure;
    Knight knight;

    @Before
    public void before() {
        treasure = new Treasure("gold", 200);
        dungeon = new Dungeon("Dungeon", treasure);
        knight = new Knight("Lancelot", Weapon.SWORD, Armour.PLATE, 100, 100, 0);
    }

    @Test
    public void canCompleteChallenge() {
        dungeon.completeChallenge(knight);
        assertEquals(200, knight.getPoints());
        assertEquals(true, dungeon.getChallangeStatus());
    }


}
