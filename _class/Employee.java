package _class;

public class Employee {
	String name;
	int number;
	int age;
	    // ���⿡ �ڵ带 �����ϼ���

	    // -------------------------------------------------------
	    //  ���ο� Employee ��ü�� �����Ѵ�.
	    // -------------------------------------------------------
		public Employee( )
		{

		}

		// ������ �޼ҵ� - �̸��� ��ȯ�Ѵ�
		public String getName()
		{
			return name;
		}

		// ������ �޼ҵ� - ��ȣ�� ��ȯ�Ѵ�
		public int getNumber( )
		{
			return number;
		}

		// ������ �޼ҵ� - ���̸� ��ȯ�Ѵ�
		public int getAge( )
		{
			return age;
		}

	    //  �� Employee ��ü�� ������ ���� ���ڿ��� ��ȯ�Ѵ�.
	    public String toString ()
	    {
		      String str = "";
		      str += "�̸�: " + name + "\n";
		      str += "��ȣ: " + number + "\n";
		      str += "����: " + age + "\n";
		      return str;
	    }

		// ������ �޼ҵ� - �̸��� �־��� ������ �����Ѵ�
		public void setName(String Name)
		{
			name = Name;
		}

		// ������ �޼ҵ� - ��ȣ�� �־��� ������ �����Ѵ�
		public void setNumber(int Number)
		{
	  		number = Number;
		}

		// ������ �޼ҵ� - ���̸� �־��� ������ �����Ѵ�
		public void setAge(int Age)
		{
	  		this.age = Age;
		}
}
