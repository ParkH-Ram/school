package test;


/*
 * 1���� 1000���̿� �����ϴ� �Ҽ��� ���
 */
public class �迭2
{
    public static void main(String[] args) //main �޼ҵ� ����
    {
        int[][] arr = new int[5][5];//ǥ�� ���� ����� 5x5�迭�� �����Ѵ� // ��ø�� ���� �� �ڰ� ��
        int num = 1;//�迭�� ������ ù��° �� num�� �����ϰ� �ʱ�ȭ�Ѵ�
        for (int i = 0; i < arr.length; i++) {//�迭 arr�� ���� ���̸�ŭ �ݺ����� ����ȴ�
            for (int j = 0; j < arr[0].length; j++) {//�迭arr[0]�� ���� ���̸�ŭ �ݺ����� ����ȴ�
                arr[i][j] = num;//arr[i][j]�� num�� �����Ѵ�
                System.out.print(arr[i][j]+ " ");//�迭 arr�� ����ִ� ���ڸ� ����Ѵ�
                num++;//num�� 1������Ų��
            }
            System.out.println();//���� �ٲ۴�
        }
    }
}