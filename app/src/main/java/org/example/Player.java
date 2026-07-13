package org.example;

import java.util.ArrayList;

public class Player {
  String name;
  ArrayList<Monster> deck = new ArrayList<>();

  public void toString() {
    System.out.println("Deck:" + this.name);
    for (int i = 0; i < 5; i++) {
      this.deck[i].toString();
    }

    return;
  }
}
