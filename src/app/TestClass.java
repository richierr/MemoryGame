package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestClass {
	  

	public static void main(String[] args) throws InterruptedException {
		long uptime = System.currentTimeMillis();

		long days = TimeUnit.MILLISECONDS
		    .toDays(uptime);
		uptime -= TimeUnit.DAYS.toMillis(days);

		long hours = TimeUnit.MILLISECONDS
		    .toHours(uptime);
		uptime -= TimeUnit.HOURS.toMillis(hours);

		long minutes = TimeUnit.MILLISECONDS
		    .toMinutes(uptime);
		uptime -= TimeUnit.MINUTES.toMillis(minutes);

		long seconds = TimeUnit.MILLISECONDS
		    .toSeconds(uptime);

		System.out.println(days+" "+hours+" "+minutes+" "+seconds);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Deck d=new Deck();
//		ArrayList<Card> inputdeck=d.shuffleMake();
//		for(Card c:inputdeck) {
//			System.out.println(c.getAdress()+" " +c.getValue());
//		}

//	Properties properties=new Properties();
//	
//	try(InputStream in=new FileInputStream("card.properties")){
//		try {
//			properties.load(in);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	} catch (FileNotFoundException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	} catch (IOException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	
//	for(int i=1;i<13;i++) {
//		System.out.println(properties.getProperty(Integer.toString(i)));
//	}
		
		
}
}