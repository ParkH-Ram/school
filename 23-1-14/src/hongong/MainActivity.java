package hongong;

public class MainActivity extends Activity{
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("�߰� ����");
	}
	public static void main(String[]args) {
		MainActivity hi = new MainActivity();
	
		hi.onCreate();
	}

}
