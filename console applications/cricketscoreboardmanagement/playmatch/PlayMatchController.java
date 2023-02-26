package com.zsgs.cricketscoreboardmanagement.playmatch;

public class PlayMatchController {
    private PlayMatchView playMatchView;
    private PlayMatchModel playMatchModel;
    public PlayMatchController(PlayMatchView playMatchView) {
        this.playMatchView = playMatchView;
        playMatchModel = new PlayMatchModel(this);
    }

    public void setPlayers() {
        playMatchModel.setPlayers();
    }

    public void addScore(int run,int ball) {
        playMatchModel.addScore(run,ball);
    }

    public void swapPlayers() {
        playMatchModel.swapPlayers();
    }

    public void setWicket() {
        playMatchModel.setWicket();
    }

}
