package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void toStringTest() {
    Monster monster = new Monster(0, 0);

    assertNotNull("デュラハン:レア度[0]", monster.toString());
  }

  @Test
  public void summonMonsterTest() {
    Monster monster = new Monster(1, 1);
    int rare = 1;
    String m = "スライム";
    assertNotNull(m, monster.summonMonster(rare));
  }

  @Test
  public void evolveMonsterTest() {
    Monster monster = new Monster(1, 3);
    monster.evolveMonster();
    String expected = "スーパースライム";
    assertEquals(expected, monster.getName());
  }

  @Test
  public void getName() {
    Monster monster = new Monster(1, 1);
    String expected = "スライム";
    assertEquals(expected, monster.getName());
  }

  @Test
  public void getRare() {
    int rare = 1;
    Monster monster = new Monster(1, rare);
    assertEquals(rare, monster.getRare());
  }

}
