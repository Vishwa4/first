import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("THIS IS VISHWA");
        LocalDate my=LocalDate.now();
        System.out.println(my);
        LocalTime my1 =LocalTime.now();
        System.out.println(my1);
        LocalDateTime my2=LocalDateTime.now();
        System.out.println(my2);
        DateTimeFormatter my3=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(my3.format(my2));

    }
}
class hello{
    public static void main(String[] args){
        System.out.println("hello");
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        String timeString = sc.nextLine();
        LocalTime time = LocalTime.parse(timeString,parseFormat);
        System.out.println(time);
        System.out.println(time.getMinute());
    }
}
class hi{
    public static void main(String[] args){
        System.out.println("khsaf");
    }
}