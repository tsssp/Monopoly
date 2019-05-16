package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.List;

import model.PlayerModel;

/**
 * 
 * �����Ϣ���ˢ��
 * 
 *
 * 
 */
public class PlayersPanel extends Layer {

	private List<PlayerModel> players = null;

	protected PlayersPanel(int x, int y, int w, int h, List<PlayerModel> players) {
		super(x, y, w, h);
		this.players = players;
	}

	/**
	 * 
	 * �����Ϣ��ʾ������
	 * 
	 */
	public void paintPlayerInformation(Graphics g) {
		int tempX = 0;
		tempX += 30;
		for (PlayerModel temp : players) {
			// �����Ϣ������
			paintPlayerPanel(temp, g, tempX, 15);
			tempX += 80;
		}
	}

	/**
	 * 
	 * �����Ϣ������
	 * 
	 */
	private void paintPlayerPanel(PlayerModel player, Graphics g, int x,
			int y) {
		// �����Ϣ�ַ���
		String[] information = { player.getName(),
				Integer.toString(player.getCash()) + " ���",
				Integer.toString(player.getNx()) + " ���",
				Integer.toString(player.getBuildings().size()) + " ����",
				Integer.toString(player.getCards().size()) + "��Ƭ" };
		// ͷ��(y += 60) + 20
		g.drawImage(player.getIMG("mini_02"), x -26 + 15 , y - 10, x -26 + 15 +player.getIMG("mini_02").getWidth(null) ,
				 y - 10 +player
					.getIMG("mini_02").getHeight(null) , 0, 0, player.getIMG("mini_02").getWidth(null), player
						.getIMG("mini_02").getHeight(null), null);
		y += 48;
		g.setColor(Color.DARK_GRAY);
		g.setFont(new Font(null,0,14));
		// ��Ϣ�ػ�
		FontMetrics fm = g.getFontMetrics();
		for (int k = 0; k < information.length; g.drawString(information[k], x
				+ (45 - fm.stringWidth(information[k])), y += 30), k++)
			;

	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
		// �����Ϣ��ʾ����ػ�
		this.paintPlayerInformation(g);
		
	}

	@Override
	public void startPanel() {
	}

}
