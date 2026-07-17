package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeMonsterGameTest {
    @Test public void addPlayerTest() {
        SeMonsterGame SeMonsterGameI = new SeMonsterGame();
        SeMonsterGameI.addPlayer("Alice");
        assertFalse(SeMonsterGameI.returnPlyers().isEmpty());
    }
}
