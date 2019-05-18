package model.buildings;

import java.util.List;

import model.LandModel;
import model.PlayerModel;
import model.TextTipModel;

import context.GameState;
import control.Control;

/**
 * 
 * ������ ��ҵ�������Է����¼�
 * 
 * 
 * @author MOVELIGHTS
 * 
 */
public class SecurityDepartment extends Building {

	private String[] events = { "��������Լ̸�Ȳ裬" };

	private PlayerModel player;

	public SecurityDepartment(int posX, int posY) {
		super(posX, posY);
		this.name = "������";
	}

	public String[] getEvents() {
		return events;
	}

	@Override
	public int getEvent() {
		return GameState.SECURITYDEPARTMENT_EVENT;
	}
}
