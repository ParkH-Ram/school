package hongong;

public class ThisJava_2�庹�� {
	
	public static void main(String[]args) { 
	int var1 = 10;
	long var2 = 1000000000L;
//	char var3 = '';    // �پ� ������ ���� 
	float var4 = 10;
	String var5 = "abc\ndef";
//	String var6 = """
//			abc
//			def
//			""";
				
	System.out.println(var1 + " " + var2 + "  " + var4 + var5); //
	
	String str = "5";
	byte v1 = Byte.parseByte(str);
	int v2 = Integer.parseInt(str);
	
	int v3 = 356;
	System.out.println((v3/100)*100);
	
	
	int top = 5;
	int bo = 10;
	int he = 7;
	double area = (double)(5+10)*7/2.0;
	
	System.out.println(area);
			
	double x =5.0;
	double y =0.0;
	double z = 5%y;    //   0�� 5�� ���� ������ ��        5/0   ->  ���Ѵ� �ƴѰ�?      0/5 ->  0
	

		if(z == 0)
			System.out.println("0.0���� �� ����");
		else {
			double result = (double)z + 10;
			System.out.println(result);
		}
	
			
	

	}
}
