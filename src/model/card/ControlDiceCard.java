package model.card;

import javax.swing.JOptionPane;

import context.GameState;

import model.PlayerModel;

/**
 * 
 * 
 * ң������,ʹ���b�����ӣ��������ɿ�����һ�������c����
 * OK
 *
 */
public class ControlDiceCard extends Card{

	int diceNumber;
	
	public ControlDiceCard(PlayerModel owner) {
		super(owner);
		this.name = "ControlDiceCard";
		this.cName = "ң�����ӿ�";
		this.price = 30;
	}

	@Override
	public int useCard() {
		/*
		Object[] options = { "1��", "2��","3��","4��","5��","6��","����ѡ��" };
		int response = JOptionPane.showOptionDialog(null,
				"ȷ��ʹ��\"ң�����ӿ�\"ң�����ӵ���?", "��Ƭʹ�ý׶�.", JOptionPane.YES_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if (response == -1 || response == 6){
			// ����ѡ��
			this.owner.useCards();
		} else {
			// ʹ��
			this.owner.getRunning().setPoint(response + 1);
			// �����ı���ʾ
			this.owner.showTextTip(this.owner.getName() + " ʹ���� \"ң�����ӿ�\".", 2);
			//����ȥ��Ƭ
			this.owner.getCards().remove(this);
		}
		this.owner.useCards();
		*/
		return GameState.CARD_CONTROLDICE;
	}
}
