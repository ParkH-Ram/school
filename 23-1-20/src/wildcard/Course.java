package wildcard;

public class Course {
	//
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"�� ��� �ߴ�");
	}


	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"�� ��� �ߴ�");
	}
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"�� ��� �ߴ�");
	}
}