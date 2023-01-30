package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class _13_ParallelExampackage {

	public static void main(String[] args) {
		Random ran = new Random();
		
		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<100000000; i++) {
			scores.add(ran.nextInt(101));
		}
		double avg = 0.0;
		double startTime = 0;
		double endTime = 0;
		double time =0;
		
		Stream<Integer> stream = scores.stream();
		startTime = System.nanoTime();
		avg = stream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = (endTime - startTime)/100000000;
		System.out.println(avg + " 일반 처리 시간  " + time + "ns");
		
		Stream<Integer> parallelStream = scores.parallelStream();
		startTime = System.nanoTime();
		avg = parallelStream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = (endTime - startTime)/100000000;
		System.out.println(avg + " 병렬 처리 시간  " + time + "ns");

	}

}
