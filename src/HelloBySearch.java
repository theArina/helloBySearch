import java.util.Random;
import java.lang.String;

public class HelloBySearch {
    public static void main (String[] args) {
        String hello = "hello Java";

        for(int i = 0; i < hello.length(); i++) {
            char rand = ' ';
            while(rand != hello.charAt(i)) {
                System.out.print(rand);
                try {
                    Thread.sleep(5);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.print("\b");
                rand = (char)('A' + new Random().nextInt(126));
            }
            System.out.print(rand);
        }
    }
}
