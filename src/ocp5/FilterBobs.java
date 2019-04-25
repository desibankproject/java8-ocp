/*package ocp5;

import java.util.*;

import java.util.function.*;

interface ApplyFilter {

   void filter(List<String> input);

}

public class FilterBobs {

static Function<String,String> first = s ->{System.out.println(s); return s;};
static Predicate second = t ->"bob".equalsIgnoreCase(t);
  public void process(ApplyFilter a,List<String> list) {
      a.filter(list);
}

public static void main(String[] contestants) {
 final List<String> people = new ArrayList<>();
 people.add("Bob");
 people.add("bob");
 people.add("Jennifer");
 people.add("Samantha");
 final FilterBobs f = new FilterBobs();
 f.process(q -> {
        q.removeIf(second);
        q.forEach(first);
     }, people);
  }

}*/