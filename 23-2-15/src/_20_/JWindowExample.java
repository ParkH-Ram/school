package _20_;

import java.awt.GraphicsEnvironment;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;


public class JWindowExample extends JWindow {
	
		public JWindowExample() {
			//Jwindow�� ũ��
			this.setSize(600, 350);
			
			// Jwindow�� ȭ�� �߾�
			
			//������� �ػ� ��������
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			
			//�߾� 
			Point center = ge.getCenterPoint();
			int leftTopX = centerPoint.x - this.getWidth()/2;
			int leftTopY = centerPoint.y - this.getHeight()/2;
			
			//JWindow �� �̹����� ���Ե� JLabel �߰�
			JLabel labe = new JLabel();
			
			label.setIcon(new ImageIcon(getClass().getResource("game.png")));
			getContentPane().add(label. BorderLayout.CENTER);
			
			this.addMouseListener(new MouserAdpter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
				}
			});
		}
	
		public static void main(String[]args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					JWindowExample jWindow = new JWindowExample();
					jWindow.setVisible(true);
				}
			}
		}
}


