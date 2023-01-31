package _18_DataInput_Output;

import java.io.Serializable;

public class _10_Member implements Serializable{
	private static final long serialVersionUID = -622284561026719240L;
	private String id;
	private String name;
	
	public _10_Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {return name + " : " + id;}

}
