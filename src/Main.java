import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) {
		try {
			Document document = Jsoup.connect("https://www.empregodf.com.br/").get();
			
			Elements top10 = document
					.getElementById("main")
					.getElementById("Blog1")
					.getElementsByClass("blog-posts").first()
					.getElementsByTag("article");
					
			for(int i = 0; i <10; i++) {
				Element post = top10.get(i);
				System.out.println((i+1)+"º título:"+post.text());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
