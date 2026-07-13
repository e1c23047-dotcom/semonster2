package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test public void toStringTest(){
        Monster monster = new Monster();
        assertNotNull("デュラハン:レア度[0]",monster.toString());
    }
}
