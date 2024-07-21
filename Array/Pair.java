public class Pair {
    public static void pairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i]; // 2 ,4, 6,
            for (int j = i + 1; j < numbers.length; j++) { // Corrected loop condition
                System.out.print("(" + current + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("totalpairs: " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairs(numbers);
    }
}
