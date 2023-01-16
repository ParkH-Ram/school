package thisJava;

public class Interface_C_ExamPlay {

	public static void main(String[]args) {
		InterFace_C_Exam imp1 = new InterFace_C_Exam();
		
		Interface_A ia = imp1;
		ia.methodA();
		ia.methodB();
		ia.methodC();
		
		Interface_B ib = imp1;
		ib.methodA();
		ib.methodB();
		ib.methodC();
		
		Interface_C ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
