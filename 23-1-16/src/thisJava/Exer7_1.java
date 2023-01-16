package thisJava;

class SutdaDeck {
	final int CARD_NUM = 20;
	 SutdaCard[] cards = new SutdaCard[CARD_NUM];
	 
	 SutdaDeck() {
		 for(int i=1; i<=cards.length; i++) {
			if(i == 1 || i == 3 || i ==8) 
				cards[i-1] = new SutdaCard(i, true);
			else if(i>10) 
				cards[i-1] = new SutdaCard(i-10, false);	 
			else
				cards[i-1] = new SutdaCard(i, false);	
			 
		 }
		 
	 }
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 ㅗㅇ버라이딩 했다.
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}

public class Exer7_1{
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+ ", ");
		
	}
}
