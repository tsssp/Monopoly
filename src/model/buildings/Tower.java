package model.buildings;

import context.GameState;
import model.PlayerModel;

public class Tower extends Building {
    private String[] events = { "�ι۲�������ʹ����������� ",
    "��ǰû�з����ܹ����� "};

    private PlayerModel player;

    public Tower(int posX, int posY) {
        super(posX, posY);
        this.name = "������";
    }

    public String[] getEvents() {
        return events;
    }

    @Override
    public int getEvent() {
        return GameState.TOWER_EVENT;
    }
}
