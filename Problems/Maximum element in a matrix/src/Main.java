import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int maxNumber = Integer.MIN_VALUE;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] > maxNumber) {
                    maxNumber = array[i][j];
                    maxX = i;
                    maxY = j;
                }
            }
        }
        System.out.println(maxX + " " + maxY);
    }
}