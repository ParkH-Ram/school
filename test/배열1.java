package test;

public class �迭1 {
	
	  public static void main(String[] args) {
	        int[][] arr = new int[5][5];
	        int num = 1;//���� �� ���ڸ� 1�� �ʱ�ȭ �Ѵ�
	        for (int i = 0; i < arr.length; i++) {//�迭�� ���̸�ŭ �ݺ����� �����Ѵ�
	            if(i%2==0) {//2�� ������ �������� 0�̶�� 0��°,2��°,4��° ���̴�
	                for (int j = 0; j < arr.length; j++) {//�� ���� ���� ���ؼ� �ݺ����� �����Ѵ�
	                    arr[i][j] = num;//num�� �迭�� �����Ѵ�
	                    num++;//num�� ũ�⸦ 1 ������Ų��
	                }                
	            }
	            else {//i�� 2�� ������ �������� 0�� �ƴ� ���,�� 1��° 3��° ���� ���
	                for (int j = 4; j >=0 ; j--) {//�� ���� ���� ���ؼ� �ݺ����� �����Ѵ�
	                    arr[i][j] = num;//num�� �迭�� �����Ѵ�
	                    num++;//num�� ũ�⸦ 1 ���� ��Ų��
	                }
	            }
	        }
	        for (int i = 0; i < arr.length; i++) {//�� �࿡ ���� �ݺ���
	            for (int j = 0; j < arr.length; j++) {//�� ���� ���� �ݺ���
	                System.out.print(arr[i][j]+ " ");//�ݺ����� �����ϸ� �迭�� �ִ� ������ ��� ����Ѵ�
	            }
	            System.out.println();
	        }
	   
	  }
}
