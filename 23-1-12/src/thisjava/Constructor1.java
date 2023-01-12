package thisjava;

class Cellphone{
	String model = "Galaxy s20+";
	String color; 
	int capacity;

	Cellphone(){
		
	}
	Cellphone(String color, int capacity){
		this.color = color;
		this.capacity = capacity;        //this.를 해줘야 초기값 설정 가능
		
	}
	
}

public class Constructor1 {
	public static void main(String[]args) {
		Cellphone myphone1 = new Cellphone();
		Cellphone myphone2 = new Cellphone("red", 500);
		
		System.out.println(myphone1.color + " " + myphone2.color);
		System.out.println(myphone1.capacity + " " + myphone2.capacity);
	}

}
