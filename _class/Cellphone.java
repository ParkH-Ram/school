package _class;

class Cellphone {
	
	String model = "Galaxy 22";
	String color;
	int capacity;
	
	Cellphone(){              // 밑에서 입력을 안 했을 시 해당 값으로 입력
		this.color="black";
	    this.capacity=32;
		
	}
	
	
	
	//Cellphone(String color, int capacity){
		//this.color = color;    //칼라가 입력 되면 디스 칼라에 들어 갔다가
		  //                    // 클래스 셀폰 칼라에 드감
		//this.capacity = capacity; 
		//this.변수 하면   Cellphone의 칼라 매개 변수 칼라 
	
	public static void main(String[]args) {
		//Cellphone myphone = Cellphone ();
		//에러 발생 : 매개변수를 이용ㅎ한 생성자를 생성시에는 기본 생성자 무시 
		Cellphone myphone = new Cellphone();
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
		
	}
	
	
}
