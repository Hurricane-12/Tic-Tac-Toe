import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int triples = 0;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
                triples++;
            }
        }
        System.out.print(triples);
    }
}