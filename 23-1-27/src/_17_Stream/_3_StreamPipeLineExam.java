package _17_Stream;
import java.util.Arrays;
import java.util.List;

public class _3_StreamPipeLineExam {
	public static void main(String[]args) {
		List<_3_Student> list = Arrays.asList(
				new _3_Student("È«±æ", 30),
				new _3_Student("È«¸¸", 40),
				new _3_Student("È«ÇÐ", 500)
		);
		
		
		double avg = list.stream()
			.mapToInt(student ->student.getScore())
			.average()
			.getAsDouble();
	
		System.out.println("Æò±Õ" + avg);
	}

}
