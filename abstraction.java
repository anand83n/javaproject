

abstract class Computer {

void turnOn() {

    System.out.println("Turning ON");
}


}

class HP extends Computer {           // child classes 

        
    void turnOn() {

        System.out.println("Turning ON-1");
}
}


class DELL extends Computer {



}


class abstraction {

public static void main(String[] args) {
    
    HP ob = new HP();

    DELL ob1 = new DELL();

    ob.turnOn();
    ob1.turnOn();
}


}