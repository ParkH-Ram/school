package test;

public class �������ϴ�_for1�� {
	
    public static void main(String[] args) {
    	 
        int sum = 0;
        int sum_sum = 0;
        
        for(int j = 1; j <= 10; j++) {
            sum = sum+j;       // ������ �������� �� ���� ���Ѵ�.
            sum_sum = sum_sum+sum;    
            // 1 �� 10�� 2�� 9�� ---- 10��1�� �������� ����
            // 1 ���� 1������ ��
            // 1 ���� 2������ ��
            // 1���� 3������ ��
            // --- 1���� 10������ ��
                    }
        System.out.println("�� " + sum_sum);     
 
    }
}


