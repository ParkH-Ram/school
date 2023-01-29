package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _4_StreamExam {
	public static void main(String[]args) {
		
		//List  �÷��� ����
		List<_4_Product> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			//�ѹ��� ���� �ҵ����� ���δ�Ʈ ����      //Math.random() 0.0<= .... < 1.0
			// ������ 0~9999������ �������� ���� �Ǵ� ��ǰ 5���� ����
			_4_Product product = new _4_Product(i, "��ǰ"+i, "�� ��ǰ�Ȱž�", (int)(10000*Math.random())); 
			
			list.add(product);
		}
		
		//��ü ��Ʈ��
		Stream<_4_Product> stream = list.stream();
		
		//foreEach�� ����ó�� �ϴ� ��
		//�Ű����� p�ڸ��� ���δ�Ʈ�� �ϳ��� ���� �Ǵ°ſ���  
		// p�� ��� ( �ڵ����� toString �� )
		stream.forEach(p -> System.out.println(p)); 
		
	}

}
