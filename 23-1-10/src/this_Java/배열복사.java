package this_Java;

public class �迭���� {
	public static void main(String[]args) {
		int [] old = {1, 2, 3};
		
		int [] newArray = new int [5];
		
		//�迭 ����
		for (int i=0; i<old.length; i++) {
			newArray[i] = old[i];    //�׸���� �ϳ��� 
		}
		
		//���
		for (int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		
		
		
	}

}
