import java.util.*;

public class except10ByContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was: " + n);
            sc.close();
        } while (true);
        
    }
}