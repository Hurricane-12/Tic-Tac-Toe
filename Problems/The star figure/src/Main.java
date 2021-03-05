import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        String[][] array = new String[mark][mark];

        for (int i = 0; i < mark; i++) {
            for (int j = 0; j < mark; j++) {
                if (i == j || i * 2 == mark - 1 ||
                        j * 2 == mark - 1 || i + j == mark - 1) {
                    array[i][j] = "*";
                } else {
                    array[i][j] = ".";
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}