
public class 예외실습6 implements AutoCloseable {
	private String name;
	
	public 예외실습6(String name) {
		this.name = name;
		System.out.println(name + " 열기 ");
	}
	public String read1() {
		System.out.println(name + " 읽기 ");
		return "100";
	}
	public String read2() {
		System.out.println(name + " 읽기 ");
		return "abc";
	}
	@Override
	public void close() throws Exception{
		System.out.println(name + " 닫기 ");
	}
}