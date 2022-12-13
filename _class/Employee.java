package _class;

public class Employee {
	String name;
	int number;
	int age;
	    // 여기에 코드를 삽입하세요

	    // -------------------------------------------------------
	    //  새로운 Employee 객체를 생성한다.
	    // -------------------------------------------------------
		public Employee( )
		{

		}

		// 접근자 메소드 - 이름을 반환한다
		public String getName()
		{
			return name;
		}

		// 접근자 메소드 - 번호을 반환한다
		public int getNumber( )
		{
			return number;
		}

		// 접근자 메소드 - 나이를 반환한다
		public int getAge( )
		{
			return age;
		}

	    //  현 Employee 객체의 정보에 대한 문자열을 반환한다.
	    public String toString ()
	    {
		      String str = "";
		      str += "이름: " + name + "\n";
		      str += "번호: " + number + "\n";
		      str += "나이: " + age + "\n";
		      return str;
	    }

		// 변경자 메소드 - 이름을 주어진 값으로 변경한다
		public void setName(String Name)
		{
			name = Name;
		}

		// 변경자 메소드 - 번호을 주어진 값으로 변경한다
		public void setNumber(int Number)
		{
	  		number = Number;
		}

		// 변경자 메소드 - 나이를 주어진 값으로 변경한다
		public void setAge(int Age)
		{
	  		this.age = Age;
		}
}
