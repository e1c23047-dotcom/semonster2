package org.example;

public class Monster {
  private String name;
  private int rare;

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
  }

  public String toString() {
    return name + ":レア度[" + rare + "]";
  }

  public String summonMonster(int num) {
    String monster[] = { "デュラハン", "スライム", "サハギン", "ドラゴン", "リヴァイアサン" };
    return monster[num];
  }

  public void evolveMonster() {
    if (this.rare >= 3) {
      this.name = "スーパー" + this.name;
    }
  }

  public String getName() {
    return this.name;
  }

  public int getRare() {
    return this.rare;
  }

}
