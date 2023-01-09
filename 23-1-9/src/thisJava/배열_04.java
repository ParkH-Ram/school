package thisJava;

public class ¹è¿­_04 {
	
	public static void main (String[]args) {
		String [][] babo = new String [3][3];
		int [][] ajdcjddl = new int [4][4];
			
		for (int i=0; i<babo.length; i++) {
			for(int j=0; j<babo[i].length; j++) {
				System.out.print("("+i+","+j+")");
			} System.out.println();
		}
		int ma =1;
		for (int i=0; i<ajdcjddl.length; i++) {
			for(int j=0; j<ajdcjddl[i].length; j++) {
				ajdcjddl[i][j] = ma;
				ma = ma +1;
				System.out.print(ajdcjddl[i][j] + "\t");
				}System.out.println();
			}
		
		
		int na = 16;
		for (int i=0; i<ajdcjddl.length; i++) {
			for(int j=0; j<ajdcjddl[i].length; j++) {
				ajdcjddl[i][j] = na;
				na = na-1;
				System.out.print(ajdcjddl[i][j] + "\t");
				}System.out.println();
			}
			
		
	}

}
