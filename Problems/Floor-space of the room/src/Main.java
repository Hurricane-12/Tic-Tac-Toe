import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String form = scanner.next();

        switch (form) {
            case "triangle":
                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                double c1 = scanner.nextDouble();
                double perimeter = (a1 + b1 + c1) / 2;
                System.out.print(Math.sqrt(perimeter * (perimeter - a1) * (perimeter - b1) * (perimeter - c1)));
                break;
            case "rectangle":
                double a2 = scanner.nextDouble();
                double b2 = scanner.nextDouble();
                System.out.print(a2 * b2);
                break;
            case "circle":
                double a3 = scanner.nextDouble();
                System.out.print(3.14 * a3 * a3);
                break;
            default:
                break;
        }
    }
}