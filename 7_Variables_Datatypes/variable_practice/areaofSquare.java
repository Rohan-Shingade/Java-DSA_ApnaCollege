import java.util.*;

public class areaofSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the side value of sqaure: ");
        int side = sc.nextInt();

        int area = side * side;

        System.out.println("Area of square is: "+ area);
        sc.close();
    }
}
