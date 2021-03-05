import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int rowNumber = 1;
        int maxRowNumber = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= array[i]) {
                rowNumber++;
            } else {
                rowNumber = 1;
            }

            if (maxRowNumber < rowNumber) {
                maxRowNumber = rowNumber;
            }
        }
        System.out.println(maxRowNumber);
    }
}