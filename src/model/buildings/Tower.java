package model.buildings;

import context.GameState;
import model.PlayerModel;

public class Tower extends Building {
    private String[] events = { "参观博雅塔，使随机房屋升级 ",
    "当前没有房屋能够升级 "};

    private PlayerModel player;

    public Tower(int posX, int posY) {
        super(posX, posY);
        this.name = "博雅塔";
    }

    public String[] getEvents() {
        return events;
    }

    @Override
    public int getEvent() {
        return GameState.TOWER_EVENT;
    }
}
