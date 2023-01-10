public class Computer {

	int sum(int ... values) {
		int sum =0;   // 배열형태로 매개변수 받기

		for (int i=0; i<values.length; i++) {
		 	sum +=values[i];
		 	
		}
		return sum;
	}
	
}
