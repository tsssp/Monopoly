package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.List;
import java.awt.Image;

import model.PlayerModel;

import javax.swing.*;

/**
 * 
 * 玩家信息面板刷新
 * 
 * @author MOVELIGHTS
 * 
 */
public class PlayersPanel extends Layer {

	private List<PlayerModel> players = null;
	private Image[] numberIMG = {
			new ImageIcon("images/logo/r/0.png").getImage(),
			new ImageIcon("images/logo/r/1.png").getImage(),
			new ImageIcon("images/logo/r/2.png").getImage(),
			new ImageIcon("images/logo/r/3.png").getImage(),
			new ImageIcon("images/logo/r/4.png").getImage(),
			new ImageIcon("images/logo/r/5.png").getImage(),
			new ImageIcon("images/logo/r/6.png").getImage(),
			new ImageIcon("images/logo/r/7.png").getImage(),
			new ImageIcon("images/logo/r/8.png").getImage(),
			new ImageIcon("images/logo/r/9.png").getImage()
	};
	protected PlayersPanel(int x, int y, int w, int h, List<PlayerModel> players) {
		super(x, y, w, h);
		this.players = players;
	}

	/**
	 * 
	 * 玩家信息显示面板绘制
	 * 
	 */
	public void paintPlayerInformation(Graphics g) {
		int tempX = 0;
		tempX += 30;
		for (PlayerModel temp : players) {
			// 玩家信息面板绘制
			paintPlayerPanel(temp, g, tempX, 15);
			tempX += 330;
		}
	}

	/**
	 * 
	 * 玩家信息面板绘制
	 * 
	 */
	public void draw_number(int x,int posX,int posY,Graphics g){
		int cash = x;
		int flag = 0;
		int d = 15;
		while((int)x >0){
			x /=10;
			flag = flag + 1;
		}
		posX = posX + flag*d;
		if( cash == 0){
			int num = 0;
			g.drawImage(numberIMG[num], posX,posY,posX + numberIMG[num].getWidth(null)-10,posY + numberIMG[num].getHeight(null)-10,0,0,numberIMG[num].getWidth(null),numberIMG[num].getHeight(null),null);
		}

		while((int)cash>0){
			int num = cash%10;
			g.drawImage(numberIMG[num], posX,posY,posX + numberIMG[num].getWidth(null)-10,posY + numberIMG[num].getHeight(null)-10,0,0,numberIMG[num].getWidth(null),numberIMG[num].getHeight(null),null);
			cash /= 10;
			posX -= 15;
		}
	}

	private void paintPlayerPanel(PlayerModel player, Graphics g, int x,
			int y) {
		// 玩家信息字符串
		String[] information = { player.getName(),
				Integer.toString(player.getCash()) + " 金币",
				Integer.toString(player.getNx()) + " 点卷",
				Integer.toString(player.getBuildings().size()) + " 房屋",
				Integer.toString(player.getCards().size()) + "卡片" };
		// 头像(y += 60) + 20
		g.drawImage(player.getIMG("mini_02"), x -26 + 15 , y - 10, x -26 + 15 +player.getIMG("mini_02").getWidth(null)-10 ,
				 y - 10 +player
					.getIMG("mini_02").getHeight(null)-10, 0, 0, player.getIMG("mini_02").getWidth(null), player
						.getIMG("mini_02").getHeight(null), null);
		x += 60;
		g.setColor(Color.DARK_GRAY);
		g.setFont(new Font(null,0,14));
		// 信息重绘
		FontMetrics fm = g.getFontMetrics();
		//player.getIMG("dollar");
		Image dollar = new ImageIcon("images/logo/dollar.png").getImage();
		g.drawImage(dollar,x,y,x+dollar.getWidth(null)-20,y+dollar.getHeight(null)-20,0,0,dollar.getWidth(null),dollar.getHeight(null),null);
		int cash = player.getCash();
		draw_number(cash,x+5,y+10,g);
		x = x + 115;
		Image Nximage = new ImageIcon("images/logo/savingPot.png").getImage();
		g.drawImage(Nximage,x,y,x+Nximage.getWidth(null)-20,y+Nximage.getHeight(null)-20,0,0,Nximage.getWidth(null),Nximage.getHeight(null),null);
		int Nx = player.getNx();
		draw_number(Nx,x+23,y+10,g);

		//Image temp = new ImageIcon("images/logo/0.png").getImage();
		//g.drawImage(numberIMG[num], x,y,x + numberIMG[num].getWidth(null),y + numberIMG[num].getHeight(null),0,0,numberIMG[num].getWidth(null),numberIMG[num].getHeight(null),null);
		//g.drawImage(temp, x,y,x + temp.getWidth(null),y + temp.getHeight(null),0,0,temp.getWidth(null),temp.getHeight(null),null);
		/*
		for (int k = 0; k < information.length; g.drawString(information[k], x
				+ (45 - fm.stringWidth(information[k])), y += 30), k++)
			;
			*/

	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
		// 玩家信息显示面板重绘
		this.paintPlayerInformation(g);
		
	}

	@Override
	public void startPanel() {
	}

}
