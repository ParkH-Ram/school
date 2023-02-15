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
			//Jwindow의 크기
			this.setSize(600, 350);
			
			// Jwindow를 화면 중앙
			
			//사용자의 해상도 가져오기
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			
			//중앙 
			Point center = ge.getCenterPoint();
			int leftTopX = centerPoint.x - this.getWidth()/2;
			int leftTopY = centerPoint.y - this.getHeight()/2;
			
			//JWindow 에 이미지가 포함된 JLabel 추가
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


