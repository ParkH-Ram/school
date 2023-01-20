package generic2;

public class GenericExam_오류메시지출력 {
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println(t1.getClass().getSimpleName()+ " " + t2.getClass().getSimpleName());
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
		public static void main(String[]args) {
			boolean result1 = compare(10, 10);
			System.out.println(result1);
			System.out.println();
		
			try {
				
			
			boolean result2 = compare(5,5.00000000000000000009); 
			System.out.println(result2);
			System.out.println();
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
			
		
}
