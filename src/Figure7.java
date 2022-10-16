public class Figure7 {
    public static void main(String[] args) {
        //question 6
        for (int row = 5; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
