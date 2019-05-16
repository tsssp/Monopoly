package model.buildings;

import java.util.List;

import model.LandModel;
import model.PlayerModel;
import model.TextTipModel;

import context.GameState;
import control.Control;

/**
 * 
 * 保卫部 玩家到这里可以发生事件
 * 
 * 
 * @author MOVELIGHTS
 * 
 */
public class SecurityDepartment extends Building {

	private String[] events = { "被保卫部约谈喝茶，" };

	private PlayerModel player;

	public SecurityDepartment(int posX, int posY) {
		super(posX, posY);
		this.name = "保卫部";
	}

	public String[] getEvents() {
		return events;
	}

	@Override
	public int getEvent() {
		return GameState.SECURITYDEPARTMENT_EVENT;
	}
}
