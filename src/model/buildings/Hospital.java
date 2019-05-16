package model.buildings;


import model.LandModel;
import model.PlayerModel;
import context.GameState;
import control.Control;

/**
 * 
 * ҽԺ ��ɫ����˵ص㣬�����ò�����Ժ����ɫסԺ��Ϻ󣬻�����������Ϸ סԺʱ�䣺1 - 4��
 * 
 * 
 *
 * 
 */
public class Hospital extends Building {
	
	private String[] events = {
			"��ҽԺ�������С�",
			"�����񾭲����ߣ���ǰһ���о����顣",
			"��ҽԺ�ſ����ϴ�٣���ȺŹ����ҪסԺ�۲졣",
			"��ҽԺ����סԺ���ѡ�"
	};
	
	public Hospital(int posX, int posY) {
		super(posX, posY);
		this.name = "ҽԺ";
	}
	public String[] getEvents() {
		return events;
	}
	@Override
	public int getEvent() {
		/*
		this.player = player;
		int days = (int) (Math.random() * 4) + 2;
		player.setInHospital(days);
		int random = (int) (Math.random() * events.length);
		String text = events[random];
		player.showTextTip(player.getName() + text + "ͣ��" + (days - 1) + "��.", 3);
		new Thread(this).start();
		*/
		return GameState.HOSPITAL_EVENT;
	}
}
