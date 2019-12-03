package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
    public static void main(String[] args) {
        // Generic Declaration
        // collection classes can be used as container for other objects.
        List<String> list = new ArrayList<String>(); //10
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");
        list.add("Banana");
        list.add("Papaya");
        list.add("Papaya");
        List<String> slist=Collections.synchronizedList(list);
        Collection<String> readOnlyList=Collections.unmodifiableCollection(list);
        Collections.shuffle(slist);

        for(String st : slist){

        }
    }
}
