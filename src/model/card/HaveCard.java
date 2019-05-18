package model.card;

import javax.swing.JOptionPane;

import context.GameState;

import model.PlayerModel;
import model.buildings.Building;

/**
 * 
 * ���ؿ�,��̎�ڲ����Լ������ϵĕr�򣬿���ʹ��ُ�ؿ����Bͬ���B������ُ�@�ô˵ء�
 * OK
 * 
 */
public class HaveCard extends Card {

	public HaveCard(PlayerModel owner) {
		super(owner);
		this.name = "HaveCard";
		this.cName = "���ؿ�";
		this.price = 50;
	}

	@Override
	public int useCard() {
		return GameState.CARD_HAVE;
	}

}
