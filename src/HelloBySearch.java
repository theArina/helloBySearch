import java.util.Random;
import java.lang.String;

public class HelloBySearch {
    public static void main (String[] args) {
        String hello = "hello Java";
//        System.out.print(hello);
//        System.out.print("\b");
//        System.out.print("!!!");

        for(int i = 0; i < hello.length(); i++) {
            char rand = ' ';
            while(rand != hello.charAt(i)) {
                System.out.print(rand);
                System.out.print("\b");
                rand = (char)('A' + new Random().nextInt(126));
            }
            System.out.print(rand);
        }
    }
}
