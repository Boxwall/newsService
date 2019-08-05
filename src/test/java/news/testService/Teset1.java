package news.testService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.news.NewsApplication;
import com.news.entity.News;
import com.news.mapper.NewsMapper;
import com.news.mapper.ReaderMapper;
import com.news.util.JedisAdapter;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = NewsApplication.class)
public class Teset1 {
	//@Autowired
	//private JedisAdapter jedisAdapter;
	@Autowired
	private NewsMapper newsMapper;
	@Autowired
	private ReaderMapper readerMapper;
	
	@Test
	public void demoMain() {
//		for(int i =0;i<10;i++) {
//			demo1();
//		}
		demo2();
	}
	public void demo2() {
		System.out.println("readerMapper.getReaderCount():"+readerMapper.getReaderCount());
		
		System.out.println("readerMapper.getReader(1, null, null):"+readerMapper.getReader(1, null, null));
		System.out.println("readerMapper.getReader(2, null, null):"+readerMapper.getReader(2, null, null));
		System.out.println("readerMapper.getReader(3, null, null):"+readerMapper.getReader(3, null, null));
		
		System.out.println("readerMapper.getReader(null, null, null):"+readerMapper.getReader(null, null, null));
		
		System.out.println("readerMapper.getReader(3, boxwall, null):"+readerMapper.getReader(null, "boxwall", null));
		System.out.println("readerMapper.getReader(null,visitor1 , null):"+readerMapper.getReader(null, "visitor1", null));
		System.out.println("readerMapper.getReader(null, visitor2, null):"+readerMapper.getReader(null, "visitor2", null));
		
		
		
	}
	
	public void demo1() {
		Random rand = new Random();
		Integer testNum = Math.abs(rand.nextInt()%100);
		System.out.println(testNum);
		
		News news = new News();
		
		news.setAuthorId(1);
		news.setCreatedTime((new Date().getTime()/1000));//秒
		news.setNewsContent("test_random_num:"+testNum);
		news.setNewsDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		news.setNewsName("news_"+testNum);
		news.setTagId(testNum%20);
		news.setTopicId(testNum%20);
		
		System.out.println(newsMapper.addNews(news));
	}
}
