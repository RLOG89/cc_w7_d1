package com.example.user.darts;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class RankingTest {

    Ranking ranking;
    Player player;
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    Player player6;
    Player player7;
    Player player8;
    Player player9;
    Player player10;

    @Before
    public void before(){
        player1 = new Player("Michael Van Gerwen", "Mighty Mike");
        player2 = new Player("Gary Anderson", "The Flying Scotsman");
        player3 = new Player("Phil Taylor", "The Power");
        player4 = new Player("Adrian Lewis", "Jackpot");
        player5 = new Player("Peter Wright", "Snakebite");
        player6 = new Player("James Wade", "The Machine");
        player7 = new Player("Robert Thornton", "The Thorn");
        player8 = new Player("Michael Smith", "Bully Boy");
        player9 = new Player("James Chisnall", "Chizzy");
        player10 = new Player("Raymond Van Barneveld", "Barney");
        ranking = new Ranking();
        ranking.addPlayer(player1);
        ranking.addPlayer(player2);
        ranking.addPlayer(player3);
        ranking.addPlayer(player4);
        ranking.addPlayer(player5);
        ranking.addPlayer(player6);
        ranking.addPlayer(player7);
        ranking.addPlayer(player8);
        ranking.addPlayer(player9);
        ranking.addPlayer(player10);
    }

    @Test
    public void testCanGetPlayerRanking() {
        player = ranking.checkRank(0);
        assertEquals("Michael Van Gerwen", player.getName());
    }

    @Test
    public void testCanRemovePlayer() {

    }
}
