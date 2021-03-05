import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int number;

        switch (string) {
            case "one":
                number = 1;
                break;
            case "two":
                number = 2;
                break;
            case "three":
                number = 3;
                break;
            case "four":
                number = 4;
                break;
            case "five":
                number = 5;
                break;
            case "six":
                number = 6;
                break;
            case "seven":
                number = 7;
                break;
            case "eight":
                number = 8;
                break;
            case "nine":
                number = 9;
                break;
            default:
                number = 0;
                break;
        }
        System.out.println(number);
    }
}