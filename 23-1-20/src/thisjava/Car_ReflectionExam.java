package thisjava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Car_ReflectionExam {

	public static void main(String[]args) {
		Class clazz = Car.class;
		System.out.println("생성자정보");
		
		Constructor[] contructors = clazz.getDeclaredConstructors();
		for(Constructor contructor : contructors ) {
			System.out.println(contructor.getName() + "(");
			Class[] parametes = contructor.getParameterTypes();
			printParameter(parametes);
			System.out.println(")");	
		}
		System.out.println();
		
		
		
		System.out.println("필드정보");
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		System.out.println();
		
		
		System.out.println("메소드");
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method Method : methods) {
			System.out.println(Method.getName() + "(");
			Class [] parameters = Method.getParameterTypes();
			printParameter(parameters);
			System.out.println(")");
		}
		System.out.println();
		
				
		
	}

	private static void printParameter(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.println(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.println(",");
			}
		}
	
		
	}
	
}
