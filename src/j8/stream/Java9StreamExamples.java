package j8.stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class Java9StreamExamples {
 
    public static void main(String[] args)
    {
        System.out.println( getDaysInJava8(LocalDate.now(), 10) );
    }
 
    //Stream of dates with 1 day difference
    public static List<LocalDate> getDaysInJava8(LocalDate start, int days)
    {
        return Stream.iterate(start, date -> date.plusDays(1))
                .limit(days)
                .collect(Collectors.toList());
    }
}