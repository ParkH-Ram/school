package _17_Stream;
import java.util.Arrays;
import java.util.List;

public class _3_StreamPipeLineExam {
	public static void main(String[]args) {
		List<_3_Student> list = Arrays.asList(
				new _3_Student("ȫ��", 30),
				new _3_Student("ȫ��", 40),
				new _3_Student("ȫ��", 500)
		);
		
		
		double avg = list.stream()
			.mapToInt(student ->student.getScore())
			.average()
			.getAsDouble();
	
		System.out.println("���" + avg);
	}

}
