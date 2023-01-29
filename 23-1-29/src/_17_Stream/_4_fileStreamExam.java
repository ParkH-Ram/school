package _17_Stream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.util.stream.Stream;

public class _4_fileStreamExam {
	public static void main(String[]args) throws Exception {
		
		// 예외 처리 안하면 에러 뜸 왜?
		Path path = Paths.get(_4_fileStreamExam.class.getResource("data.txt").toURI());
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		
		
	}

}
