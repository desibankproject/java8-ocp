package ocp5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class Dessert {
  public static void main(String[] yum) {
        eatDessert(Optional.empty());
        LocalDate xmas = LocalDate.of(2017,12, 25);
        LocalDate blackFriday =LocalDate.of(2017, 10, 24);
        long monthsLeft = ChronoUnit.MONTHS.between(xmas, blackFriday);
        System.out.println(monthsLeft);
  }

  private static void eatDessert(Optional<String> opt) {
         System.out.println(opt.orElseGet(()->"Hello Nagendra"));
         System.out.println(opt.orElse("Hello Mr. Nagendra"));
  }
}