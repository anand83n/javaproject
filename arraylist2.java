import java.util.ArrayList;  // import the array list class
import java.util.Collections; 

public class arraylist2 {


public static void main(String[] args) {


ArrayList<String> cars = new ArrayList<String>(); // create an arrayList object 

cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");


Collections.sort(cars);
for (String i : cars) {

    System.out.println(i);
    
}


   

}



}

