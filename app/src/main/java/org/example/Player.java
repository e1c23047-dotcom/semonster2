package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  String name; // Player name
  int hp;      // プレイヤーのHPを追加

  ArrayList<Monster> monsterDeck = new ArrayList<>();
  LinkedList<Integer> randomNumberList;

  // コンストラクタでHPも受け取る
  Player(LinkedList<Integer> randomNumberList, String playerName, int hp) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
    this.hp = hp;
  }

  /**
   * モンスターを5体分drawする
   */
  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.monsterDeck.add(new Monster(this.randomNumberList.pop(),
                                       this.randomNumberList.pop()));
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    // HPを表示するように変更
    sb.append("Player:").append(this.name)
      .append(" HP:").append(this.hp).append("\n");

    sb.append("Deck:\n");

    for (Monster m : this.monsterDeck) {
      sb.append(m).append("\n");
    }

    return sb.toString();
  }
}
