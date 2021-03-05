import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int direction = scanner.nextInt();

        switch (direction) {
            case 1:
                System.out.print("move up");
                break;
            case 2:
                System.out.print("move down");
                break;
            case 3:
                System.out.print("move left");
                break;
            case 4:
                System.out.print("move right");
                break;
            case 0:
                System.out.print("do not move");
                break;
            default:
                System.out.print("error!");
                break;
        }
    }
}