package test;


/*
 * 1부터 1000사이에 존재하는 소수를 출력
 */
public class 배열2
{
    public static void main(String[] args) //main 메소드 선언
    {
        int[][] arr = new int[5][5];//표와 같이 출력할 5x5배열을 선언한다 // 중첩이 앞이 행 뒤가 열
        int num = 1;//배열에 대입할 첫번째 수 num을 선언하고 초기화한다
        for (int i = 0; i < arr.length; i++) {//배열 arr의 행의 길이만큼 반복문이 수행된다
            for (int j = 0; j < arr[0].length; j++) {//배열arr[0]의 열의 길이만큼 반복문이 수행된다
                arr[i][j] = num;//arr[i][j]에 num을 대입한다
                System.out.print(arr[i][j]+ " ");//배열 arr에 들어있는 숫자를 출력한다
                num++;//num을 1증가시킨다
            }
            System.out.println();//줄을 바꾼다
        }
    }
}