import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] numbers = new int[row][column];
        int[][] rotatedNumbers = new int[column][row];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }

       for (int i = 0; i < column; i++) {
           for (int j = 0; j < row; j++) {
               rotatedNumbers[i][j] = numbers[row - j - 1][i];
               if (j == row - 1){
                   System.out.println(rotatedNumbers[i][j]);
               } else {
                   System.out.print(rotatedNumbers[i][j] + " ");
               }
           }
       }
    }
}