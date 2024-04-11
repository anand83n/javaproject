/*
 * Short circuit logical operators
 * &&  ||
 * 
 */

 public class shortcircuit {

    public static void main(String[] args) {

        int a=22;

        System.out.println((a>20) && (a<30));

        //                 false     true
        System.out.println((a<20) || (a>30));
        
    }
 }