package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void toStringTest() {
    Monster monster = new Monster();
    monster.name = "デュラハン";
    monster.rare = 0;

    assertNotNull("デュラハン:レア度[0]", monster.toString());
  }

  @Test
  public void summonMonsterTest() {
    Monster monster = new Monster();
    int rare = 1;
    String m = "スライム";
    assertNotNull(m, monster.summonMonster(rare));
  }
}
