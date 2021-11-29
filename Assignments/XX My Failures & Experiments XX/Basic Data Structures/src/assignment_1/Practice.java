package assignment_1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Practice {

	public static void main(String[] args) {
	ZoneId zoneId= ZoneId.of("Asia/Tokyo");
	ZonedDateTime zonedDateTime=ZonedDateTime.of(LocalDateTime.now(),zoneId);
	System.out.println(zonedDateTime);
	
	}
}
