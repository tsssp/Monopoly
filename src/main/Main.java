package main;

import javax.swing.JFrame;
import javax.swing.UIManager;

import ui.JFrameGame;
import ui.WaitFrame;
import ui.config.FrameConfig;

public class Main {

	static {
		// ������ʽ
		try {
			///UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e1) {
			
		}
	}

	public static void main(String[] args) {
		// �����ȴ�����
		WaitFrame wFrame = new WaitFrame();
		// ������Ϸ������
		JFrameGame frame = new JFrameGame();
		// ������Ϸ���ô���
		new FrameConfig(wFrame,frame);
	}
}
