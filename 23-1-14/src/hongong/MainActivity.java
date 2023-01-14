package hongong;

public class MainActivity extends Activity{
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("추가 실행");
	}
	public static void main(String[]args) {
		MainActivity hi = new MainActivity();
	
		hi.onCreate();
	}

}
