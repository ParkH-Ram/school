package _class;

public class quest6_1클래스생성{     //클래스 생성
	
	int num;
	boolean isKwang;

	public quest6_1클래스생성() {    //메소드 = 지역 변수로 적용 돼서 작동
		

		this.num = 1;             //this ( 클래스 값 ... 제일 높은  꼭대기로 감)
		this.isKwang = true;
		}
	
	public quest6_1클래스생성(int num, boolean isKWang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info(){            //스트링 지정을 해줘야 한다.
		return num + (isKwang? "K" : "");
	}
	
}

//클래스 생성