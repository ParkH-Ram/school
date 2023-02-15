package _20_;


import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



public class App3 extends JFrame{

	public App3() {
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
			//이벤트 큐에 Runnable 넣기
			SwingUtilities.invokeLater(new Runnable(){
				public void run() {
					App app = new App();
					app.setVisible(true);
					System.out.println(Thread.currentThread().getName());
				}
			});
		
		}
}
