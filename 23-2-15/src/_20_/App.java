package _20_;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App extends Frame {
   public App() {
	   
	   //���� ����
      setTitle("�谡 ������ �޴��� ���� �ּ�");
      
      //â�� ���� ũ�� ����
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