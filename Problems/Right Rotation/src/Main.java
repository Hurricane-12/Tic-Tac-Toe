import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int numbersLength = numbers.length;

        int shift = scanner.nextInt() % numbersLength;
        if (shift == 0) {
            System.out.println(String.join(" ", numbers));
            return;
        }

        String[] shiftedNumbers = new String[numbersLength];
        System.arraycopy(numbers, 0, shiftedNumbers, shift, numbersLength - shift);
        System.arraycopy(numbers, numbersLength - shift, shiftedNumbers, 0, shift);
        System.out.print(String.join(" ", shiftedNumbers));
    }
}