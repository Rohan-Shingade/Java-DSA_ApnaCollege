public class Diamond {
    public static void dimond (int rows) {

        //upper half
        for (int i=1; i<=rows; i++) {
            //for spaces
            for (int j=1; j<=(rows-i); j++) {
                System.out.print(" ");
            }

            //for stars
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom half
        for (int i=rows; i>=1; i--) {
            //for spaces
            for (int j=1; j<=(rows-i); j++) {
                System.out.print(" ");
            }

            //for stars
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        dimond(5);
    }
}
