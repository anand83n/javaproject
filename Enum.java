


enum Level {    

BEGINNER ("B"), INTERMEDIATE("I"), ADVANCED("A");     

private String abbr;

Level(String ab) {

    abbr = ab;
}

public String getAbbr() {

return abbr;

}


}

public class Enum {


public static void main(String[] args) {
    
    Level l1 =  Level.ADVANCED;

System.out.println(l1);
System.out.println(l1.getAbbr());

}

}