import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++){
            if (i == size - 1){
                numbers[0] = scanner.nextInt();
            } else {
                numbers[i + 1] = scanner.nextInt();
            }
        }

        for (int value : numbers){
            System.out.print(value + " ");
        }
    }
}