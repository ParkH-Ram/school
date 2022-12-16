package test;

public class 배열1 {
	
	  public static void main(String[] args) {
	        int[][] arr = new int[5][5];
	        int num = 1;//대입 할 숫자를 1로 초기화 한다
	        for (int i = 0; i < arr.length; i++) {//배열의 길이만큼 반복문을 수행한다
	            if(i%2==0) {//2로 나눠서 나머지가 0이라면 0번째,2번째,4번째 행이다
	                for (int j = 0; j < arr.length; j++) {//각 행의 열에 대해서 반복문을 수행한다
	                    arr[i][j] = num;//num을 배열에 대입한다
	                    num++;//num의 크기를 1 증가시킨다
	                }                
	            }
	            else {//i를 2로 나눠서 나머지가 0이 아닌 경우,즉 1번째 3번째 행인 경우
	                for (int j = 4; j >=0 ; j--) {//각 행의 열에 대해서 반복문을 수행한다
	                    arr[i][j] = num;//num을 배열에 대입한다
	                    num++;//num의 크기를 1 증가 시킨다
	                }
	            }
	        }
	        for (int i = 0; i < arr.length; i++) {//각 행에 대한 반복문
	            for (int j = 0; j < arr.length; j++) {//각 열에 대한 반복문
	                System.out.print(arr[i][j]+ " ");//반복문을 수행하며 배열에 있는 값들을 모두 출력한다
	            }
	            System.out.println();
	        }
	   
	  }
}
