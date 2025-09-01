package ExtraBuiltInFunction.list2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {
    public static void main(String[] args) {
        displayTime("GMT");
        displayTime("Asia/Kolkata");
        displayTime("America/Los_Angeles");
    }
    public static void displayTime(String zone) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println(zone + ": " + time.format(format));
    }
}
