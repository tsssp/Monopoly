package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.FrameUtil;

public class WaitFrame extends JFrame {

	public WaitFrame() {
		// 设置名字
		this.setTitle("PKU版大富翁");
		// 设置默认关闭属性（程序结束）
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口大小
		this.setSize(460, 400);
		// 不允许用户改变窗口大小s
		this.setResizable(false);
		// 居中
		FrameUtil.setFrameCenter(this);
		add(new JLabel("正在努力加载，稍等哦...",JLabel.CENTER));
		setVisible(true);
	}

}
