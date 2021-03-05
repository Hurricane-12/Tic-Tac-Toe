class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        for (int[] number : twoDimArray) {
            for (int j = 0; j < number.length / 2; j++) {
                number[j] += number[number.length - 1 - j];
                number[number.length - 1 - j] = number[j] - number[number.length - 1 - j];
                number[j] -= number[number.length - 1 - j];
            }
        }

    }
}