package Patterns.Iterations.Stars;

public class pattern24 {
    public static void main(String[] args) {
        draw(5);
    }

    /*
    *        *
    **      **
    * *    * *
    *  *  *  *
    *   **   *
    *   **   *
    *  *  *  *
    * *    * *
    **      **
    *        *
     */
    static void draw(int n) {

        // upper half ->  n
        for (int row = 1; row <= n; row++) {

            // upper left triangle.
            for (int col = 1; col <= row; col++) {

                if (row == 1 || col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // the spaces after analyzing comes to a point where it is equal to the product of 2 * (n-i)
            for (int sp = 1; sp <= 2 * (n - row); sp++) {
                System.out.print(" ");
            }

            // upper right stars.
            for (int col = 1; col <= row; col++) {

                if (row == 1 || col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // lower half
        for (int row = n; row >= 1; row--) {

            // lower left triangle.
            for (int col = 1; col <= row; col++) {

                if (col == n || col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // the spaces after analyzing comes to a point where it is equal to the product of 2 * (n-i)
            for (int sp = 1; sp <= 2 * (n - row); sp++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
