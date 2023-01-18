
public class 예외실습7 {
	public static void main(String[]args) {
		try(예외실습6 res = new 예외실습6("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외" + e.getMessage());
		}
		System.out.println();
		
		try(예외실습6 res = new 예외실습6("A")){
			String data = res.read2();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외" + e.getMessage());
		}
		System.out.println();
		
		예외실습6 res1 = new 예외실습6("A");
		예외실습6 res2 = new 예외실습6("A");
		

		}


}
