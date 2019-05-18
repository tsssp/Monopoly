package model;

import java.util.ArrayList;
import java.util.List;

import model.buildings.*;

/**
 * 全局房屋信息
 * 
 *
 * 
 */
public class BuildingsModel extends Tick implements Port{
	/**
	 * 房屋链表
	 */
	private List<Building> buildings = null;
	
	private LandModel land = null;

	
	public BuildingsModel (LandModel land){
		this.land = land;
	}


	/**
	 * 
	 * 初始化房屋
	 * 
	 */
	private void initBuilding() {
		// 初始化链表
		buildings = new ArrayList<Building>();
		// 对应地图加入房屋
		int[][] temp = this.land.getLand();
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				switch (temp[i][j]) {
				case LandModel.WESTGATE:
					Building tmpBuidling = new WestGate(i, j);
					// 设置西门的属性为可以购买的
					tmpBuidling.setPurchasability(true);
					buildings.add(tmpBuidling);
					break;
				case LandModel.LIBRARY:
					buildings.add(new Library(i, j));
					break;
				case LandModel.TOWER:
					buildings.add(new Tower(i, j));
					break;
				case LandModel.SPACE:
					Building tempBuidling = new House(i, j);
					// 设置空地的属性为可以购买的
					tempBuidling.setPurchasability(true);
					buildings.add(tempBuidling);
					break;
				case LandModel.HOSPITAL:// 医院
					buildings.add(new Hospital(i, j));
					//设置全图医院点
					LandModel.hospital = new java.awt.Point(j * 60,i * 60);
//					System.out.println(LandModel.hospital );
					break;
				case LandModel.NEWS:
					buildings.add(new News(i, j));
					break;
				case LandModel.ORIGIN:
					buildings.add(new Origin(i, j));
					LandModel.Origin = new java.awt.Point(j * 60,i * 60);
					break;
				case LandModel.PARK:
					buildings.add(new Park(i, j));
					break;
				case LandModel.PIONT_50:
					buildings.add(new Point(i, j, 50));
					break;
				case LandModel.SHOP:
					buildings.add(new Shop_(i, j));
					break;
				case LandModel.SECURITYDEPARTMENT:// 保卫部
					buildings.add(new SecurityDepartment(i, j));
					//设置全图保卫部点
					LandModel.SecurityDepartment = new java.awt.Point(j * 60, i * 60);
//					System.out.println(LandModel.prison );
					break;
				default:
					break;
				}
			}
		}
	}

	/**
	 * 
	 * 获得房屋表
	 * 
	 * @return
	 */
	public List<Building> getBuilding(){
		return buildings;
	}
	/**
	 * 
	 * 获得当前位置房屋
	 * 
	 */
	public Building getBuilding(int x,int y){
		for (Building temp : this.buildings){
			if (temp.getPosX() == x && temp.getPosY() == y){
				return temp;
			}
		}
		return null;
	}
	/**
	 * 
	 * 开始游戏设置
	 * 
	 */
	public void startGameInit (){
		// 初始化房屋
		initBuilding();
	}

	@Override
	public void update(long tick) {
		this.nowTick = tick;
		
	}
}