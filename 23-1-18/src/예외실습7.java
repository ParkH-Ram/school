
public class ���ܽǽ�7 {
	public static void main(String[]args) {
		try(���ܽǽ�6 res = new ���ܽǽ�6("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("����" + e.getMessage());
		}
		System.out.println();
		
		try(���ܽǽ�6 res = new ���ܽǽ�6("A")){
			String data = res.read2();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("����" + e.getMessage());
		}
		System.out.println();
		
		���ܽǽ�6 res1 = new ���ܽǽ�6("A");
		���ܽǽ�6 res2 = new ���ܽǽ�6("A");
		

		}


}
