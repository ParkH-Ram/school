package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _4_StreamExam {
	public static void main(String[]args) {
		//List  �÷��� ����
		List<_4_Product> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			_4_Product product = new _4_Product(i, "��ǰ"+i, "���� ȸ��", (int)(10000*Math.random()));
			
			list.add(product);
		}
		
		//��ü ��Ʈ��
		Stream<_4_Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p)); 
		
	}

}
