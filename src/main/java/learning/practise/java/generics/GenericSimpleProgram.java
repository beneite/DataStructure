package learning.practise.java.generics;

public class GenericSimpleProgram {

    public static <T> void printValues(T t) {

        System.out.println(t.getClass().getName()
                + " = " + t);
    }

    public static void main(String[] args) {
        int a = 10;
        String str = "Ashish";
        char ch = 'a';
        printValues(a);
        printValues(str);
        printValues(ch);


    }
}
