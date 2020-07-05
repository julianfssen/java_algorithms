import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] elements = new int[size];

        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }

        int max = elements[0];
        int nextMax = elements[1];

        for (int i = 0; i < elements.length; i++) {
            if (i + 1 != elements.length && elements[i + 1] > max) {
                nextMax = max;
                max = elements[i + 1];
            }

            if (i + 2 < elements.length && elements[i + 2] > nextMax) {
                nextMax = elements[i + 2];
            }

        }

        System.out.println(nextMax * max);
    }
}