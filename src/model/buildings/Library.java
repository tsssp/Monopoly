package model.buildings;

import context.GameState;
import model.PlayerModel;

public class Library extends Building {
    private String[] events = { "在图书馆学习使得你精神充沛，获得1000金币和一次额外骰子机会 "};

    private PlayerModel player;

    public Library(int posX, int posY) {
        super(posX, posY);
        this.name = "图书馆";
    }

    public String[] getEvents() {
        return events;
    }

    @Override
    public int getEvent() {
        return GameState.LIBRARY_EVENT;
    }
}
