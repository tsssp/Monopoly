package model.buildings;

import context.GameState;
import model.PlayerModel;

public class WestGate extends Building {
    private String[] events = { "在图书馆学习使得你精神充沛，获得1000金币和一次额外骰子机会 "};

    private PlayerModel player;
    private int upPrice;
    private String[] nameString = { "西门" };

    public WestGate(int posX, int posY) {
        super(posX, posY);
        this.name = "西门";
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
     * 税率
     *
     * @return
     */
    public int getRevenue() {
        /**
         * 税率计算方法
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
