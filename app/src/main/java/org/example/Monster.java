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

  public void elementMonster() {
    int elem = -1;
    String elements[] = { "火", "水", "闇" };
    String fire[] = { "ドラゴン" };
    String water[] = { "スライム", "サハギン", "リヴァイアサン" };
    String dark[] = { "デュラハン" };

    if (this.rare >= 2) {
      for (int i = 0; i < fire.length; i++) {
        if (this.name.equals(fire[i])) {
          elem = 0;
        }
      }
      for (int i = 0; i < water.length; i++) {
        if (this.name.equals(water[i])) {
          elem = 1;
        }
      }
      for (int i = 0; i < dark.length; i++) {
        if (this.name.equals(dark[i])) {
          elem = 2;
        }
      }
    }
    this.name = elements[elem] + "・" + this.name;
  }

  public String getName() {
    return this.name;
  }

  public int getRare() {
    return this.rare;
  }

}
