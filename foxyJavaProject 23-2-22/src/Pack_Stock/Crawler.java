package Pack_Stock;

import java.io.IOException;
import java.text.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Crawler {

	void CrawlerMethod() throws ParseException {
		String URL = "https://finance.naver.com/item/main.naver?code=005930";
		Document doc;
		
		try {
			doc = Jsoup.connect(URL).get();
			Elements todaylist = doc.select(".new_totalinfo dl>dd");
			for(int i = 0; i < 12; i++)
				System.out.println(todaylist.get(i).text());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
