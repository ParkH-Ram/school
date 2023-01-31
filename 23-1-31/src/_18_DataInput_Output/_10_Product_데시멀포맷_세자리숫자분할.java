package _18_DataInput_Output;

import java.io.Serializable;
import java.text.DecimalFormat;

public class _10_Product_���ø�����_���ڸ����ں��� implements Serializable{
	private static final long serialVersionUID = -622284561026719240L;   // ���̵� ���� �ߺ����� �ʰ� ������ �� ���
	private String name;
	private String price;
	DecimalFormat df = new DecimalFormat("###,###");
	
	public _10_Product_���ø�����_���ڸ����ں���(String name, int price) {
		this.name = name;
		this.price = df.format(price); 
	}
	
	@Override
	public String toString() {return name  + " : " + price;}

}
