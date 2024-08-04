
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 

 class addingdate{



 public static void main(String[] args) {


LocalDateTime ob = LocalDateTime.now();

System.out.println("Before formatting:" + ob);

DateTimeFormatter ob2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

String formattedDate = ob.format(ob2);

System.out.println("after formatting " + formattedDate);

}
    

}
