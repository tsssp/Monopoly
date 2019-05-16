package model.buildings;

import java.util.List;

import model.LandModel;
import model.PlayerModel;
import model.TextTipModel;

import context.GameState;
import control.Control;

/**
 * 
 * ���� ��ҵ���������������߷��������¼�
 * 
 * 
 *
 * 
 */
public class Prison extends Building {

	private String[] events = { "ȥ�����������ѣ�", "��ԩ��������", "����������Աץȥ��ɨ������" };

	private PlayerModel player;

	public Prison(int posX, int posY) {
		super(posX, posY);
		this.name = "����";
	}

	public String[] getEvents() {
		return events;
	}

	@Override
	public int getEvent() {
		return GameState.PRISON_EVENT;
	}
}
