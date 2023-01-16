package thisJava;

import java.util.*;

class SutdaDeck1 {

	final int CARD_NUM = 20;
	 SutdaCard1[] cards = new SutdaCard1[CARD_NUM];
	 
	 SutdaDeck1() {
		 for(int i=1; i<=cards.length; i++) {
			if(i == 1 || i == 3 || i ==8) 
				cards[i-1] = new SutdaCard1(i, true);
			else if(i>10) 
				cards[i-1] = new SutdaCard1(i-10, false);	 
			else
				cards[i-1] = new SutdaCard1(i, false);		 
		 } 
	 }
	 
	 void shuffle(){
		 for(int i=0; i<cards.length; i++) {
			 System.out.print(cards[(int)(Math.random()*20)].num); 
		 }
	 }
	SutdaCard1 pick() {
		  int ran = (int) Math.random() % CARD_NUM;
		  return cards[ran];
		 }
	
		 
    	public SutdaCard1 pick(int num) {
    		if(num < 0 || num >= CARD_NUM)
    			return null;
    		return cards[num];
			 }	 
	
}

class SutdaCard1{
	int num;
	boolean isKwang;
	
	SutdaCard1(){
		this(1, true);
	}
	
	SutdaCard1(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 ㅗㅇ버라이딩 했다.
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}

public class Exer7_2{
	public static void main(String args[]) {
		SutdaDeck1 deck = new SutdaDeck1();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		System.out.println();
		for(int i=0; i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+ ", ");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
