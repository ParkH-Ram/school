public class Computer {

	int sum(int ... values) {
		int sum =0;   // �迭���·� �Ű����� �ޱ�

		for (int i=0; i<values.length; i++) {
		 	sum +=values[i];
		 	
		}
		return sum;
	}
	
}
