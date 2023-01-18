package hello230118;

public class ExceptionPractice6 implements AutoCloseable {
	private String name;
	
	public ExceptionPractice6(String name) {
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