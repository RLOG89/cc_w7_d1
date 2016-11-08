package com.example.user.darts;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class Ranking {

    private ArrayList<Player> playerList;

    public Ranking(){
        this.playerList = new ArrayList<Player>();
    }

    public void addPlayer(Player player){
        this.playerList.add(player);
    }

    public Player checkRank(int rank) {
        return this.playerList.get(rank);
    }

    public void RemovePlayer(Player player){
        this.playerList.remove(player);
    }
}
