package ui;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.FrameUtil;

public class WaitFrame extends JFrame {

	public WaitFrame() {
		// ��������
		this.setTitle("PKU�����");
		// ����Ĭ�Ϲر����ԣ����������
		//this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڴ�С
		this.setSize(460, 400);
		// �������û��ı䴰�ڴ�Сs
		this.setResizable(false);
		// ����
		FrameUtil.setFrameCenter(this);
		JLabel lb=new JLabel("����Ŭ�����أ��Ե�Ŷ...",JLabel.CENTER);
		add(lb);
		//add(new JLabel("����Ŭ�����أ��Ե�Ŷ...",JLabel.CENTER));
		setVisible(true);
		//lb.setBackground(Color.WHITE);
		//lb.setOpaque(true);
	}

}
