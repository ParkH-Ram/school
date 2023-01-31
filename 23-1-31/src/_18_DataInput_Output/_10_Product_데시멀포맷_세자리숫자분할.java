package _18_DataInput_Output;

import java.io.Serializable;
import java.text.DecimalFormat;

public class _10_Product_데시멀포맷_세자리숫자분할 implements Serializable{
	private static final long serialVersionUID = -622284561026719240L;   // 아이디 생성 중복되지 않게 복잡한 값 사용
	private String name;
	private String price;
	DecimalFormat df = new DecimalFormat("###,###");
	
	public _10_Product_데시멀포맷_세자리숫자분할(String name, int price) {
		this.name = name;
		this.price = df.format(price); 
	}
	
	@Override
	public String toString() {return name  + " : " + price;}

}
