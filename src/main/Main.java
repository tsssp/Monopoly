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
		// 设置样式
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

		Font font = new Font("宋体",Font.BOLD,12);
		InitGlobalFont(font);
		// 建立等待界面
		WaitFrame wFrame = new WaitFrame();
		// 建立游戏主窗口
		JFrameGame frame = new JFrameGame();
		// 建立游戏配置窗口
		new FrameConfig(wFrame,frame);
	}


}
