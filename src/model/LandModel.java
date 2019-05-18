package model;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

import control.GameRunning;

/**
 * 土地
 */
public class LandModel extends Tick implements Port {
    /**
     * 土地图片
     */
    private Image landsIMG = null;
    /**
     * 空地
     */
    public final static int SPACE = 1;
    /**
     * 10元奖券
     */
    public final static int PIONT_10 = 2;
    /**
     * 30元奖券
     */
    public final static int PIONT_30 = 3;
    /**
     * 50元奖券
     */
    public final static int PIONT_50 = 4;
    /**
     * 商店
     */
    public final static int SHOP = 5;
    /**
     * 乐透
     */
    public final static int LOTTERY = 6;
    /**
     * 新闻
     */
    public final static int NEWS = 7;
    /**
     * 医院
     */
    public final static int HOSPITAL = 8;
    /**
     * 公园
     */
    public final static int PARK = 9;
    /**
     * 起点
     */
    public final static int ORIGIN = 10;
    /**
     * 监狱
     */
    public final static int SECURITYDEPARTMENT = 11;
    /**
     * 无建筑
     */
    public final static int NULL_SET = 0;

    public final static int PIONT_90 = 1;
    public final static int PIONT_60 = 1;
    public final static int WESTGATE = 6;
    public final static int TOWER = 12;
    public final static int LIBRARY = 13;
    public final static int EAST_GATE = ORIGIN;
    public final static int WUMEI = 1;
    public final static int BAIJIANG = 1;
    public final static int NONGYUAN = 1;

    public final static int XUEWU = 1;
    public final static int XUEYI = 1;
    /**
     * 医院信息
     */
    public static Point hospital = new Point(0, 0);
    /**
     * 监狱信息
     */
    public static Point SecurityDepartment = new Point(0, 0);

    public static Point Origin = new Point(0, 0);
    public static Point prison = new Point(0, 0);

    public LandModel() {
        this.landsIMG = new ImageIcon("images/window/land.jpg").getImage();
    }

    public Image getLandsIMG() {
        return landsIMG;
    }

    public void setLandsIMG(Image landsIMG) {
        this.landsIMG = landsIMG;
    }

    protected int[][] land3 = {
            // 模仿大富翁其中一个地图设置
            {ORIGIN, SHOP, SPACE, SPACE, SPACE, SPACE, SPACE, SECURITYDEPARTMENT, SPACE, SPACE, SPACE, SPACE, SPACE},
            {SHOP, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, PIONT_50},
            {SHOP, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, PIONT_50},
            {SHOP, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, PIONT_50},
            {SHOP, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, PIONT_50},
            {SHOP, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, PIONT_50},
            {SHOP, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, PIONT_50},
            {SPACE, NEWS, SPACE, NEWS, SPACE, NEWS, SPACE, NEWS, HOSPITAL, NEWS, SPACE, SHOP, SPACE}};

    protected int[][] land2 = {
            // 模仿大富翁其中一个地图设置
            {ORIGIN, SHOP, SPACE, SPACE, PIONT_50, NEWS, SECURITYDEPARTMENT, SPACE, SPACE, SPACE, PIONT_50, SPACE, NEWS},
            {SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE},
            {PARK, NULL_SET, NULL_SET, NULL_SET, NEWS, SPACE, SPACE, SPACE, SHOP, SPACE, PIONT_50, SPACE, HOSPITAL},
            {PIONT_50, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE},
            {SPACE, NULL_SET, NULL_SET, NULL_SET, SHOP, PIONT_10, PIONT_30, PIONT_10, PARK, SPACE, SPACE, SPACE, PIONT_50},
            {SPACE, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
            {PIONT_30, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
            {SECURITYDEPARTMENT, SPACE, SPACE, HOSPITAL, NEWS, SPACE, PARK, SPACE, NEWS, NULL_SET, NULL_SET, NULL_SET, NULL_SET}};

    //{ ORIGIN, SPACE, HOSPITAL, PIONT_50, SHOP, SPACE, SecurityDepartment, SPACE,
    protected int[][] land1 = {
            // 模仿大富翁其中一个地图设置
            {ORIGIN, SPACE, HOSPITAL, PIONT_50, SHOP, NEWS, SECURITYDEPARTMENT, NEWS,
                    SPACE, PARK, NULL_SET, NULL_SET, NULL_SET},
            {NEWS, NULL_SET, NULL_SET, NULL_SET, NEWS, NULL_SET, NULL_SET,
                    NULL_SET, NULL_SET, PIONT_30, NEWS, SPACE, NEWS},
            {NEWS, NULL_SET, NULL_SET, NULL_SET, NEWS, NULL_SET, NULL_SET,
                    NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE,},
            {NEWS, NULL_SET, NULL_SET, NULL_SET, NEWS, NULL_SET, NULL_SET,
                    NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE},
            {SPACE, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET,
                    NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE},
            {SPACE, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET,
                    NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE},
            {PARK, NULL_SET, NULL_SET, NULL_SET, PIONT_30, NULL_SET, NULL_SET,
                    NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE},

            {NEWS, PIONT_30, SPACE, SPACE, SHOP, PIONT_10, SPACE, SPACE,
                    SPACE, SPACE, HOSPITAL, PIONT_50, SPACE}};

    public int[][] land4 =
            {{NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, PIONT_30, SPACE, SPACE, SPACE, NULL_SET, NULL_SET},
                    {NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE, SPACE, PIONT_30, SPACE, PIONT_90, SPACE, NEWS, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET},
                    {PIONT_60, SPACE, SPACE, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET},
                    {SPACE, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, SPACE, PIONT_30, SPACE, NULL_SET, SPACE, SPACE, HOSPITAL, NULL_SET, NULL_SET},
                    {SPACE, NULL_SET, SPACE, WESTGATE, SPACE, SPACE, PIONT_30, NULL_SET, NULL_SET, SPACE, NULL_SET, SPACE, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
                    {SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, SPACE, PIONT_30, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
                    {SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, TOWER, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
                    {SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
                    {PIONT_60, SPACE, SPACE, NEWS, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, LIBRARY, SPACE, SPACE, SPACE, EAST_GATE, SPACE, SPACE, SPACE, SPACE},
                    {NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE},
                    {NULL_SET, NULL_SET, NULL_SET, WUMEI, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE},
                    {NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, BAIJIANG, SPACE, NONGYUAN, SPACE, SECURITYDEPARTMENT, SPACE, SPACE, PIONT_60, SPACE},
                    {NULL_SET, NULL_SET, NULL_SET, XUEWU, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
                    {NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, SPACE, SPACE, SPACE, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
                    {NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, SPACE, NULL_SET, SPACE, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
                    {NULL_SET, NULL_SET, NULL_SET, SPACE, NULL_SET, XUEYI, NULL_SET, SPACE, NULL_SET, SPACE, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
                    {NULL_SET, NULL_SET, NULL_SET, PIONT_30, SPACE, SPACE, NULL_SET, SPACE, SPACE, NEWS, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET},
                    {NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET, NULL_SET}
            };

    protected int[][] land;

    public int[][] getLand() {
        return land;
    }

    /**
     * 匹配地图事件
     */
    public int matchLand(PlayerModel player) {
        return land[player.getY()][player.getX()];
    }

    /**
     * 开始游戏设置
     */
    public void startGameInit() {

        if (GameRunning.MAP == 1) {
            land = land1;
        } else if (GameRunning.MAP == 2) {
            land = land2;
        } else if (GameRunning.MAP == 3) {
            land = land3;
        } else if (GameRunning.MAP == 4) {
            land = land4;
        } else {
            throw new RuntimeException("land model binding error");
        }
    }

    @Override
    public void update(long tick) {
        this.nowTick = tick;

    }

}
