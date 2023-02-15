package _20_;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App extends Frame {
   public App() {
	   
	   //제목 설정
      setTitle("배가 고프다 메뉴를 정해 주셈");
      
      //창에 대한 크기 지정
      setSize(500, 400);  
      add(new Button("Ok"), BorderLayout.SOUTH);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
   }

   public static void main(String[] args) {
      App app = new App();
      app.setVisible(true);
   }

}