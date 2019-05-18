package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Font;
import java.awt.FontFormatException;

import control.Control;


import model.DiceModel;


/**
 * 
 * ���������
 * 
 *
 * 
 */
@SuppressWarnings("serial")
public class Dice extends Layer {

	private Control control;
	private DiceModel dice;
	private DiceButton diceButton;
	

	protected Dice(int x, int y, int w, int h, Control control) {
		super(x, y, w, h);
		setLayout(null);
		this.control = control;
		this.dice = control.getDice();
		this.diceButton = new DiceButton(control, 105, 32);
		add(diceButton);
	}

	@Override
	public void paint(Graphics g) {
		//���ڻ���
		this.createWindow(g);
		//���ӻ���
		this.paintDice(g, -12, -15);
		//���Ӱ�ť��ʾ
		this.showDice();
		// ���Ӱ�ťˢ��
		diceButton.update(g);
	}

	/**
	 * 
	 * ���ӻ���
	 * 
	 */
	private void paintDice(Graphics g, int i, int j) {
		// ���������˶�
		if (dice.getStartTick() < dice.getNowTick()
				&& dice.getNextTick() >= dice.getNowTick()) {
			dice.setDiceState(DiceModel.DICE_RUNNING);
		} else {
			dice.setDiceState(DiceModel.DICE_POINT);
		}

		if (dice.getDiceState() == DiceModel.DICE_POINT) {
			this.paintPoint(g, i, j);
		} else if (dice.getDiceState() == DiceModel.DICE_RUNNING) {
			this.paintRunning(g, i, j, dice.getNowTick() % 4 == 0);
		}
		g.setColor(Color.black);
		g.setFont(new Font("����",Font.BOLD,12));
		g.drawString(dice.getRunning().getNowPlayer().getName() + ":", i + 120,
				j + 45);
	}

	public DiceButton getDiceButton() {
		return diceButton;
	}

	/**
	 * 
	 * �����˶�״̬����
	 * 
	 */
	public void paintRunning(Graphics g, int x, int y, boolean change) {
		if (change) {
			dice.addImgCount(1);
		}
		Image temp = dice.getNowImg();
		g.drawImage(temp, x, y, x + temp.getWidth(null),
				y + temp.getHeight(null), 0, 0, temp.getWidth(null),
				temp.getHeight(null), null);
	}

	/**
	 * 
	 * ���Ӳ�����������
	 * 
	 */
	public void paintPoint(Graphics g, int x, int y) {
		Image temp = dice.getDicePoints()[dice.getPoint()];
		g.drawImage(temp, x, y, x + temp.getWidth(null),
				y + temp.getHeight(null), 0, 0, temp.getWidth(null),
				temp.getHeight(null), null);
	}

	/**
	 * 
	 * ���Ӱ�ť��ʾ
	 * 
	 */
	private void showDice() {
		diceButton.setEnabled(dice.isShowDiceLabel());
	}

	@Override
	public void startPanel() {
	}

}
