import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print(array[len - 1] + " ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}