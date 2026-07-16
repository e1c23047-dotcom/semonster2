package org.example;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void testPlayerToString() {

        LinkedList<Integer> randomList = new LinkedList<>();

        // モンスター5体分（名前番号, レア度）の10個の値
        randomList.add(0);
        randomList.add(0);

        randomList.add(1);
        randomList.add(1);

        randomList.add(2);
        randomList.add(2);

        randomList.add(3);
        randomList.add(3);

        randomList.add(4);
        randomList.add(4);

        Player player = new Player(randomList, "user",100);
        player.drawMonsters();

        String expected =
                "Player:user HP:100\n"
                + "Deck:\n"
                + "デュラハン:レア度[0]\n"
                + "スライム:レア度[1]\n"
                + "サハギン:レア度[2]\n"
                + "ドラゴン:レア度[3]\n"
                + "リヴァイアサン:レア度[4]\n"; 
        Assert.assertEquals(expected, player.toString());
    }
}
