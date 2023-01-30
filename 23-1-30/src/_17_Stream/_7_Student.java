package _17_Stream;

public class _7_Student implements Comparable<_7_Student>{
	private String name;
	private int score;
	
	public _7_Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getscore() {return score;}
	
	@Override
	public int compareTo(_7_Student o) {
		return Integer.compare(score, o.score);
	}

}
