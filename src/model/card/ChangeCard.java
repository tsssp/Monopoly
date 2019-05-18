package model.card;

import javax.swing.JOptionPane;

import context.GameState;

import model.PlayerModel;
import model.buildings.Building;

/**
 * 
 * ���ݿ�,ͣ�����з��ݵ������ϕr������ʹ�ÓQ�ݿ������QҕҰ�ȷ��ݡ�
 * 
 * 
 */
public class ChangeCard extends Card {

	public ChangeCard(PlayerModel owner) {
		super(owner);
		this.name = "ChangeCard";
		this.cName = "���ݿ�";
		this.price = 70;
	}

	@Override
	public int useCard() {
		return GameState.CARD_CHANGE;
	}

}
