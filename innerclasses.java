//JAVA INNER CLASSES 

/* the purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable. */
// outer class
class OuterClass {

    int x = 10;

    class InnerClass {

        public int myMethod() {

            return x;

        }

    }

}

public class innerclasses {

    public static void main(String[] args) {

        OuterClass myOuter = new OuterClass();

        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myInner.myMethod());

    }

}
