package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.FrameUtil;

public class WaitFrame extends JFrame {

	public WaitFrame() {
		// ��������
		this.setTitle("PKU�����");
		// ����Ĭ�Ϲر����ԣ����������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڴ�С
		this.setSize(460, 400);
		// �������û��ı䴰�ڴ�Сs
		this.setResizable(false);
		// ����
		FrameUtil.setFrameCenter(this);
		add(new JLabel("����Ŭ�����أ��Ե�Ŷ...",JLabel.CENTER));
		setVisible(true);
	}

}
