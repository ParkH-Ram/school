package _class;

class Cellphone {
	
	String model = "Galaxy 22";
	String color;
	int capacity;
	
	Cellphone(){              // �ؿ��� �Է��� �� ���� �� �ش� ������ �Է�
		this.color="black";
	    this.capacity=32;
		
	}
	
	
	
	//Cellphone(String color, int capacity){
		//this.color = color;    //Į�� �Է� �Ǹ� �� Į�� ��� ���ٰ�
		  //                    // Ŭ���� ���� Į�� �尨
		//this.capacity = capacity; 
		//this.���� �ϸ�   Cellphone�� Į�� �Ű� ���� Į�� 
	
	public static void main(String[]args) {
		//Cellphone myphone = Cellphone ();
		//���� �߻� : �Ű������� �̿뤾�� �����ڸ� �����ÿ��� �⺻ ������ ���� 
		Cellphone myphone = new Cellphone();
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
		
	}
	
	
}
