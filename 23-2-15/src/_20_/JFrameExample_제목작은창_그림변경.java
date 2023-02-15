package _20_;


import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JFrameExample_��������â_�׸����� extends JFrame {

   public JFrameExample_��������â_�׸�����() {
      // ������ ũ�� ����
      this.setSize(600, 500);
      // ���� ǥ���� ������, ���� ����
      this.setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
      this.setTitle("����â");
      // ���� ��ư �⺻ ���
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // ȭ�� �߾ӿ� ����
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      Point centerPoint = ge.getCenterPoint();
      int leftTopX = centerPoint.x - this.getWidth()/2;
      int leftTopY = centerPoint.y - this.getHeight()/2;
      this.setLocation(leftTopX, leftTopY);
      
   }
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            JFrameExample_��������â_�׸����� jframe = new JFrameExample_��������â_�׸�����();
            jframe.setVisible(true);
         }
      });

   }

}