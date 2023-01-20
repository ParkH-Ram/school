package thisjava;

public class Generic_GenericExam {
	public static void main(String[]args) {
		//Box<String> box1 = new Box<String>();
		Generic_Box<String> box1 = new Generic_Box<>();
		box1.content = "¾È³ç";
		String str = box1.content;
		System.out.println(str);
		
		//Box<Integer> box2 = new Box<Integer>();
		Generic_Box<Integer> box2 = new Generic_Box<>();
		box2.content = 100;
		int value  = box2.content;
		System.out.println(value);
	}
}
