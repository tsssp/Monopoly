package model.card;

import javax.swing.JOptionPane;

import context.GameState;

import model.PlayerModel;

/**
 * 
 * 
 * ͣ����,���������Լ�ʹ��ͣ����������׌Ŀ��ԭ��ͣ��һ�غϡ�
 * 
 * һ����������������������ͣ����Ч�������า�w��
 * 
 * 
 *
 */
public class StopCard extends Card{

	public StopCard(PlayerModel owner) {
		super(owner);
		this.name = "StopCard";
		this.cName ="ͣ����";
		this.price = 50;
	}

	@Override
	public int useCard() {
		return GameState.CARD_STOP;
	}
	/**
	 * 
	 *  ��Ƭ����Ч��
	 * 
	 */
	@Override
	public int cardBuff(){
		return GameState.CARD_BUFF_STOP;
	}
}
