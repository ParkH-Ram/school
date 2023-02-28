package pratice;

import java.util.ArrayList;
import java.util.Scanner;

import controller.CompanyTable;
import model.Company;

public class DBMain {
	
	public static void main(String[]args) {
		DBconnection dbconn = new DBconnection();		
		dbconn.DBconn();
		
		//제네릭 타입으로 만든 애는 제니릭 타입으로 불러와야함
		
		ArrayList<Company> list = null;
		list = new CompanyTable().select();
		System.out.println(list);
	}

}
