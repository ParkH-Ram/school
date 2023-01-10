package this_Java;

public class 배열복사 {
	public static void main(String[]args) {
		int [] old = {1, 2, 3};
		
		int [] newArray = new int [5];
		
		//배열 복사
		for (int i=0; i<old.length; i++) {
			newArray[i] = old[i];    //항목들을 하나씩 
		}
		
		//출력
		for (int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		
		
		
	}

}
