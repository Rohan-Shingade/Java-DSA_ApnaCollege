import java.util.*;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        String type = ((number %2) == 0) ? "Even" : "Odd" ; 
        System.out.println(type);
        sc.close();
    }
}
