import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date_DateTimeCompareExam {
	public static void main(String[]args) {
		DecimalFormat df = new DecimalFormat("###,###");
		LocalDateTime now = LocalDateTime.now();
		
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss"); 
		
		LocalDateTime start = LocalDateTime.of(2023, 1, 1, 0, 0, 0);  //�̰� �����ð�
		System.out.println("������ :" + start.format(dtf));
		System.out.println("����ð� :" + now.format(dtf));
		
		
		LocalDateTime end = LocalDateTime.of(2023, 3, 31, 19, 0, 0);
		System.out.println("������ : " + end.format(dtf));
		
		if(now.isBefore(end)) {
			System.out.println("������");
		}else if(now.isEqual(end)) {
			System.out.println("����");
		}else if(now.isAfter(end)) {
			System.out.println("�����ߴ�");
		}
		
		long remainYear = now.until(end, ChronoUnit.YEARS);
		long remainMonth = now.until(end, ChronoUnit.MONTHS);
		long remainDay = now.until(end, ChronoUnit.DAYS);
		long remainHour = now.until(end, ChronoUnit.HOURS);
		long remainMinute = now.until(end, ChronoUnit.MINUTES);
		long remainSecond = now.until(end, ChronoUnit.MILLIS);   //�и���   
 		String remainY = df.format(remainYear);
		String remainM = df.format(remainMonth);
		String remainD = df.format(remainDay);
		String remainH = df.format(remainHour);
		String remainm = df.format(remainMinute);
		String remainS = df.format(remainSecond);
		
	
		System.out.println("���� �� : " + remainY);
		System.out.println("���� �� : " + remainM);
		System.out.println("���� �� : " + remainD);
		System.out.println("���� �� : " + remainH);
		System.out.println("���� �� : " + remainm);
		System.out.println("���� �и��� : " + remainS);
		
		
		
	
		
	}

}
