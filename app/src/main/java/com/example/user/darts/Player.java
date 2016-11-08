package com.example.user.darts;

/**
 * Created by user on 07/11/2016.
 */

public class Player {
    private String name;
    private String nickname;
    private int Ranking;

    public Player(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        this.Ranking = 0;
    }

    public void setRanking(int worldRanking) {
        this.Ranking = worldRanking;
    }

    public String getRanking(int index) {
        return playerList.get(index);
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return ("Name: " + name + ", Nickname: " + nickname + ", Ranking:" + 1);
    }
}