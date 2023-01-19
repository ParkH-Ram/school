import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date_DateTimeCompareExam {
	public static void main(String[]args) {
		DecimalFormat df = new DecimalFormat("###,###");
		LocalDateTime now = LocalDateTime.now();
		
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss"); 
		
		LocalDateTime start = LocalDateTime.of(2023, 1, 1, 0, 0, 0);  //이건 고정시간
		System.out.println("시작일 :" + start.format(dtf));
		System.out.println("현재시간 :" + now.format(dtf));
		
		
		LocalDateTime end = LocalDateTime.of(2023, 3, 31, 19, 0, 0);
		System.out.println("종료일 : " + end.format(dtf));
		
		if(now.isBefore(end)) {
			System.out.println("진행중");
		}else if(now.isEqual(end)) {
			System.out.println("종료");
		}else if(now.isAfter(end)) {
			System.out.println("종료했다");
		}
		
		long remainYear = now.until(end, ChronoUnit.YEARS);
		long remainMonth = now.until(end, ChronoUnit.MONTHS);
		long remainDay = now.until(end, ChronoUnit.DAYS);
		long remainHour = now.until(end, ChronoUnit.HOURS);
		long remainMinute = now.until(end, ChronoUnit.MINUTES);
		long remainSecond = now.until(end, ChronoUnit.MILLIS);   //밀리초   
 		String remainY = df.format(remainYear);
		String remainM = df.format(remainMonth);
		String remainD = df.format(remainDay);
		String remainH = df.format(remainHour);
		String remainm = df.format(remainMinute);
		String remainS = df.format(remainSecond);
		
	
		System.out.println("남은 해 : " + remainY);
		System.out.println("남은 달 : " + remainM);
		System.out.println("남은 일 : " + remainD);
		System.out.println("남은 시 : " + remainH);
		System.out.println("남은 분 : " + remainm);
		System.out.println("남은 밀리초 : " + remainS);
		
		
		
	
		
	}

}
