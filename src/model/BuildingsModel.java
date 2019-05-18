package model;

import java.util.ArrayList;
import java.util.List;

import model.buildings.*;

/**
 * ȫ�ַ�����Ϣ
 * 
 *
 * 
 */
public class BuildingsModel extends Tick implements Port{
	/**
	 * ��������
	 */
	private List<Building> buildings = null;
	
	private LandModel land = null;

	
	public BuildingsModel (LandModel land){
		this.land = land;
	}


	/**
	 * 
	 * ��ʼ������
	 * 
	 */
	private void initBuilding() {
		// ��ʼ������
		buildings = new ArrayList<Building>();
		// ��Ӧ��ͼ���뷿��
		int[][] temp = this.land.getLand();
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				switch (temp[i][j]) {
				case LandModel.WESTGATE:
					Building tmpBuidling = new WestGate(i, j);
					// �������ŵ�����Ϊ���Թ����
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
					// ���ÿյص�����Ϊ���Թ����
					tempBuidling.setPurchasability(true);
					buildings.add(tempBuidling);
					break;
				case LandModel.HOSPITAL:// ҽԺ
					buildings.add(new Hospital(i, j));
					//����ȫͼҽԺ��
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
				case LandModel.SECURITYDEPARTMENT:// ������
					buildings.add(new SecurityDepartment(i, j));
					//����ȫͼ��������
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
	 * ��÷��ݱ�
	 * 
	 * @return
	 */
	public List<Building> getBuilding(){
		return buildings;
	}
	/**
	 * 
	 * ��õ�ǰλ�÷���
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
	 * ��ʼ��Ϸ����
	 * 
	 */
	public void startGameInit (){
		// ��ʼ������
		initBuilding();
	}

	@Override
	public void update(long tick) {
		this.nowTick = tick;
		
	}
}