public class Figure8 {
    public static void main(String[] args) {
        //question 7
        for (int row = 1; row <= 5; row++) {
            // System.out.printf("row: %d ", row);

            for (int col = 1; col <= 5; col++) {
                System.out.printf("*","%5d ",row * col);
            }

            System.out.println("");
        }
    }
}
