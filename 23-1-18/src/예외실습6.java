
public class ���ܽǽ�6 implements AutoCloseable {
	private String name;
	
	public ���ܽǽ�6(String name) {
		this.name = name;
		System.out.println(name + " ���� ");
	}
	public String read1() {
		System.out.println(name + " �б� ");
		return "100";
	}
	public String read2() {
		System.out.println(name + " �б� ");
		return "abc";
	}
	@Override
	public void close() throws Exception{
		System.out.println(name + " �ݱ� ");
	}
}