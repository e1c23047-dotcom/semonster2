package org.example;
import java.util.ArrayList;
import java.util.List;

public class SeMonsterGame {
    //playerインスタンスを保持するためのリスト
    private static List<Player> playerList = new ArrayList<>();

    public void addPlayer(String playerName, int hp) {
        Player player = new Player(playerName, hp);
        playerList.add(player);
    }

    public void draw(String playerName) {
        //プレイヤー名に一致するPlayerインスタンスを検索
        for (Player player : playerList) {
            if (player.name.equals(playerName)) {
                // 俺の解釈：draw()はplayerクラスの手札にモンスターをランダムで追加するメソッド
                player.deck.add(new Monster((int) (Math.random() * 5), (int) (Math.random() * 5)));
                return;
            }
        }
    }

    public List<Player> returnPlyers() {
        for (Player player : playerList) {
            System.out.println("Player: " + player.name);
            for (Monster monster : player.deck) {
                System.out.println(monster.toString());
            }
        }
        return playerList;
    }
}
