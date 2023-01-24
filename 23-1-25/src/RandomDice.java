import java.util.Date;
import java.util.Random;

public class RandomDice {
	public static void main(String[]args) {
		double hey;
		Date date = new Date();
		Random ran = new Random(date.getTime());  // 시드값을 바꿔줘야 나오는 무작위 값의 조합이 달라짐
 		
		switch(ran.nextInt(7)) {
		case 1: System.out.println("박단현");
		break;
		case 2: System.out.println("박단hyun");
		break;
		case 3: System.out.println("박단혀언");
		break;
		case 4: System.out.println("변경원");
		break;
		case 5: System.out.println("변경");
		break;
		case 6: System.out.println("워니");
		break;
		case 7: System.out.println("경워니");
		break;
		}
		
		
		
	}

}
