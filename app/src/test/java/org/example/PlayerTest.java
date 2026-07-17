package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void toStringTest() {
    String name = "user";
    int hp = 500;
    Player p = new Player(name,hp);

    String output = "Deck:" + name + "\n";
    output += "HP:" + hp + "\n";
    for (Monster m : p.link) {
      output += m + "\n";
    }

    assertNotNull(output, p.toString());
  }
}
