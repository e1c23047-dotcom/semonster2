package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void toStringTest() {
    String name = "user";
    Player p = new Player(name);

    String output = "Deck:" + name + "\n";
    for (Monster m : p.link) {
      output += m + "\n";
    }

    assertNotNull(output, p.toString());
  }
}
