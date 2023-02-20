package _swing_;

import javax.swing.*;

public class JMenuExample extends JFrame{
	private JMenuBar jMenuBar;
	private JMenu menuFile, menuNew, menuHelp;
	private JMenuItem menuItemNewFile, menuItemNewFolder;
	
	public JMenuExample() {
		this.setTitle("JMenuExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getJMenuBar());
		this.setSize(300,200);
	}
	
	//메뉴바 생성
	public JMenuBar getJMenuBar() {
		if (jMenuBar == null) {
			jMenuBar = new JMenuBar();
			//메인메뉴 추가 : 젤 상단 2개의 메뉴 표시
			jMenuBar.add(getMenuFile());
			jMenuBar.add(getMenuHelp());
		}
		return jMenuBar;
	}

	//파일 관련 메뉴 : 새파일, 열기 , 저장 나가기
	public JMenu getMenuFile() {
		if(menuFile == null) {
			menuFile = new JMenu();
			// 서브 메뉴 
			menuFile.add(getMenuNew());
			menuFile.add(getMenuItemOpen());
			menuFile.add(getMenuItemSave());
			
			
			
		}

	public static void main(String[]args) {
	
		
	}

}
