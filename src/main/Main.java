package main;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.FontFormatException;
import javax.swing.plaf.FontUIResource;
import java.util.Enumeration;
import java.util.Vector;


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

	private static void InitGlobalFont(Font font) {
		FontUIResource fontRes = new FontUIResource(font);
		for (Enumeration<Object> keys = UIManager.getDefaults().keys();
			 keys.hasMoreElements(); ) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof FontUIResource) {
				UIManager.put(key, fontRes);
			}
		}
	}


	public static void main(String[] args) {

		Font font = new Font("����",Font.BOLD,12);
		InitGlobalFont(font);
		// �����ȴ�����
		WaitFrame wFrame = new WaitFrame();
		// ������Ϸ������
		JFrameGame frame = new JFrameGame();
		// ������Ϸ���ô���
		new FrameConfig(wFrame,frame);
	}


}
