package _20_;


import java.awt.BorderLayout;
import java.awt.event.WindowEvent;

import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;



public class App2 extends JFrame{

	public App2() {
		//  제목
		setTitle("Swing App");
		// 창 사이즈
		setSize(400,200);
		getContentPane().add(new JButton("ok"), BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
		public static void main(String[]args) {
			App2 app = new App2();
			app.setVisible(true);
		
		}
}
