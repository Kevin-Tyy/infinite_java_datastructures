package Patterns.Iterations.Numbers;

public class pattern26 {
    public static void main(String[] args) {
        draw(6);
    }

    /*
    1 1 1 1 1 1
    2 2 2 2 2
    3 3 3 3
    4 4 4
    5 5
    6
     */
    static void draw(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n + 1) - row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();

        }
    }
}