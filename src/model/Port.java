package model;

public interface Port {
	/**
	 * 
	 * ģ�͸���
	 * 
	 */
	public abstract void update(long tick);
	
	/**
	 * 
	 * ��Ϸ��ʼ��
	 * 
	 */
	public abstract void startGameInit();
}
