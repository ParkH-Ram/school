package hello230118;

public class ExceptionPractice7{
	public static void main(String[]args) {
		try(ExceptionPractice6 res = new ExceptionPractice6("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
			System.out.println(value);
		} catch(Exception e) {
			System.out.println("예외" + e.getMessage());
		}
		System.out.println();
		
		try(ExceptionPractice6 res = new ExceptionPractice6("A")){
			String data = res.read2();
			int value = Integer.parseInt(data);
			System.out.println(value);
		}catch(Exception e) {
			System.out.println("예외" + e.getMessage());
			
		}
		System.out.println();
		
		ExceptionPractice6 res1 = new ExceptionPractice6("A");
		ExceptionPractice6 res2 = new ExceptionPractice6("A");
		

		}


}
