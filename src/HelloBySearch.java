import java.util.Random;
import java.lang.String;

public class HelloBySearch {
    public static void main (String[] args) {
        String hello = "Hello Java!";

        for(int i = 0; i < hello.length(); i++) {
            char rand = ' ';

            while(rand != hello.charAt(i)) {
                System.out.print(rand);
                try {
                    Thread.sleep(10);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.print("\b");
                rand = (char)('!' + new Random().nextInt(90));
            }
            System.out.print(rand);
        }
    }
}
