package com.example.user.darts;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    Player player1;

    @Before
    public void before(){
        player1 = new Player("Michael Van Gerwen", "Mighty Mike");

    }

    @Test
    public void playerHasName(){
        assertEquals("Michael Van Gerwen", player1.getName());
    }

    @Test
    public void playerHasNickname(){
        assertEquals("Mighty Mike", player1.getNickname());
    }

    @Test
    public void overideToString(){
        assertEquals("Name: Michael Van Gerwen, Nickname: Mighty Mike, Ranking:1", player1.toString());
    }
}
