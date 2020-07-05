import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        boolean symmetric = true;

        int[][] numbers = new int[size][size];

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < size; i++){
            for (int j = -1; j < size - 1; j ++){
                if (numbers[i][j + 1] != numbers[j + 1][i]){
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}