package this_Java;

import java.util.Calendar;

public class weekes {

	public static void main(String[] args) {
		//���� Ÿ�� ���� ����
		week today = null;
		
		//���� �� ����
		today = week.THURSDAY; 
		// ������ ���ŷ� ������ ���� ��� ����
		
		if(today == week.FRIDAY) {
			System.out.println("������ �ݿ��̿�?..");
		}else {
			System.out.println("�ݿ����� �Ƴ�...");
		}
		// ��ǻ�� ���� ���� 
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_WEEK);
		
		switch(day) {
			case 1: today = week.SUNDAY; break;
			case 2: today = week.MONDAY; break;
			case 3: today = week.TUESDAY; break;
			case 4: today = week.WEDNESDAY; break;
			case 5: today = week.THURSDAY; break;
			case 6: today = week.FRIDAY; break;
			case 7: today = week.SATURDAY; break;
			
			}
		
		//���Ű� ��
		if(today == week.SUNDAY) {
			System.out.println("������ �Ͽ��̿�?..");
		}else {
			System.out.println("�Ƴ� ������... " + today + "�̿�..");
		}
		System.out.println(today);
		
		
	

	}

}
