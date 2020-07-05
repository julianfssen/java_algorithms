import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    final static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] numbers = createArray();
        int[][] copy = copyArray(numbers);
        int[] lines = new int[numbers.length];
        int[] downLines = new int[numbers.length];

        int size = numbers.length;
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += numbers[i][j];
                sum2 += numbers[j][i];
            }
            lines[i] = sum;
            downLines[i] = sum2;
            sum = 0;
            sum2 = 0;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                copy[i][j] = lines[i] + downLines[j] - (copy[i][j] * 2);

                if (j == size - 1) {
                    System.out.println((copy[i][j]));
                } else {
                    System.out.print(copy[i][j] + " ");
                }
            }
        }
    }

    public static int[][] copyArray(int[][] numbers) {
        int[][] duplicateArray = new int[numbers.length][numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            System.arraycopy(numbers[i], 0, duplicateArray[i], 0, numbers.length);
        }

        return duplicateArray;
    }

    public static int[][] formatArray(ArrayList<Integer> numbers) {
        int size = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (i * i == numbers.size()) {
                size = i;
            }
        }

        int[][] formattedArray = new int[size][size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                formattedArray[i][j] = numbers.get(counter);
                counter++;
            }
        }

        return formattedArray;
    }

    public static int[][] createArray() {
        ArrayList<Integer> numbers = new ArrayList<>();
        String input = "";
        boolean flag = true;

        while (flag) {
            input = scanner.next();

            /*if(input.length() == 1){
                int[][] numberOne = new int[2][2];
                for (int i = 0; i < 2; i++){
                    for (int j = 0; j < 2; j++){
                        numberOne[i][j] = 1;
                    }
                }
                return numberOne;
            }*/

            if ("end".equals(input)) {
                flag = false;
                continue;
            }

            numbers.add(Integer.valueOf(input));
        }

        return formatArray(numbers);
    }
}