package org.example;

public class Monster {
  public String name;
  public int rare;

  public String toString() {
    return name + ":レア度[" + rare + "]";
  }

  public String summonMonster(int rare) {
    String monster[] = { "デュラハン", "スライム", "サハギン", "ドラゴン", "リヴァイアサン" };
    return monster[rare];
  }
}
