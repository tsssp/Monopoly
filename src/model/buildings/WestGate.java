package model.buildings;

import context.GameState;
import model.PlayerModel;

public class WestGate extends Building {
    private String[] events = { "��ͼ���ѧϰʹ���㾫����棬���1000��Һ�һ�ζ������ӻ��� "};

    private PlayerModel player;
    private int upPrice;
    private String[] nameString = { "����" };

    public WestGate(int posX, int posY) {
        super(posX, posY);
        this.name = "����";
        this.maxLevel = 0;
    }

    public String[] getEvents() {
        return events;
    }

    public int getUpLevelPrice() {
        this.upPrice = 1000;
        return upPrice;
    }

    public int getAllPrice() {
        int price = 0;
        for (int i = 0; i <= level; i++) {
            if (this.level == 0) {
                price +=500;
            } else {
                price += 1000 * i;
            }
        }
        return price;
    }

    /**
     * ˰��
     *
     * @return
     */
    public int getRevenue() {
        /**
         * ˰�ʼ��㷽��
         */
        this.revenue = this.level * (int) (Math.random() * 1000)
                + (this.level * 800);
        return revenue;
    }

    public String getName() {
        return this.nameString[this.level];
    }
    @Override
    public int getEvent() {
        return GameState.WESTGATE_EVENT;
    }
}
