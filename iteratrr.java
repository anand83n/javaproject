
import java.util.ArrayList;
import java.util.Iterator;





public class iteratrr {

public static void main(String[] args) {

// Make a collection 

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while (it.hasNext()) {
        Integer i = it.next();
        if (i < 10) {
            it.remove();
        }
    }

        System.out.println(numbers);
    }
}
    




