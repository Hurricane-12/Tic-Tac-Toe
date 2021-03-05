import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] cinemaSeat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinemaSeat[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int seatTotal = 0;
            for (int j = 0; j < m; j++) {
                if (cinemaSeat[i][j] == 0) {
                    seatTotal++;
                } else {
                    seatTotal = 0;
                }
                if (seatTotal == k) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}