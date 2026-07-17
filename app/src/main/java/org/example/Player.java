package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  String name;
  int deckSize = 8;
  ArrayList<Monster> deck = new ArrayList<>();
  LinkedList<Monster> link = new LinkedList<>();

  public Player(String name) {
    this.name = name;

    for (int i = 0; i < deckSize; i++) {
      int monsterId = (int) (Math.random() * 5);
      int rarity = (int) (Math.random() * 5);
      Monster monster = new Monster(monsterId, rarity);

      deck.add(monster);
      link.add(monster);
    }

  }

  public String toString() {
    String message = "";

    message += "Deck:" + this.name + "\n";
    for (Monster monster : deck) {
      message += monster + "\n";
    }

    return message;
  }
}
