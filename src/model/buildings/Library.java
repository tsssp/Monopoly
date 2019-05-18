package model.buildings;

import context.GameState;
import model.PlayerModel;

public class Library extends Building {
    private String[] events = { "��ͼ���ѧϰʹ���㾫����棬���1000��Һ�һ�ζ������ӻ��� "};

    private PlayerModel player;

    public Library(int posX, int posY) {
        super(posX, posY);
        this.name = "ͼ���";
    }

    public String[] getEvents() {
        return events;
    }

    @Override
    public int getEvent() {
        return GameState.LIBRARY_EVENT;
    }
}
