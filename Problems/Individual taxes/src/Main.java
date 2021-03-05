import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companyTotal = scanner.nextInt();
        int[] income = new int[companyTotal];
        int[] tax = new int[companyTotal];

        for (int i = 0; i < companyTotal; i++) {
            income[i] = scanner.nextInt();
        }
        for (int i = 0; i < companyTotal; i++) {
            tax[i] = scanner.nextInt();
        }

        int companyNumber = 0;
        double maxTax = income[companyNumber] * ((double) tax[companyNumber] / 100);
        for (int i = 0; i < companyTotal; i++) {
            if (maxTax < income[i] * ((double) tax[i]) / 100) {
                companyNumber = i;
                maxTax = income[i] * ((double) tax[i]) / 100;
            }
        }
        System.out.print(companyNumber + 1);
    }
}