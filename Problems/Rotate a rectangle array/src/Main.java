import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arrayOriginal = new int[n][m];
        int[][] arrayReversed = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayOriginal[i][j] = scanner.nextInt();
                arrayReversed[j][n - 1 - i] = arrayOriginal[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayReversed[i][j] + " ");
            }
            System.out.println();
        }
    }
}