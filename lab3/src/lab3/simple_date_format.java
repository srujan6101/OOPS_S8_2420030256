package lab3;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class  simple_date_format {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter event date and time (yyyy-MM-dd HH:mm):");
        String input = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date eventDate = sdf.parse(input);
        Date now = new Date();

        long eventMillis = eventDate.getTime();
        long nowMillis = now.getTime();
        long diff = eventMillis - nowMillis;

        if (diff < 0) {
            System.out.println("The event date/time is in the past.");
        } else {
            long diffMinutes = diff / 60000; 

            long days = diffMinutes / (24 * 60);
            long hours = (diffMinutes % (24 * 60)) / 60;
            long minutes = diffMinutes % 60;

            System.out.println("Time left until event:");
            System.out.println(days + " days, " + hours + " hours, and " + minutes + " minutes");
        }

      
    }
}