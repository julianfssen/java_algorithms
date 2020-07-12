import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int totalSize = size * size;
        int[][] table = new int[totalSize][totalSize];
        int[][] copy = new int[totalSize][totalSize];
        ArrayList<Integer> sorted = new ArrayList<>();
        boolean solved = true;

        for (int i = 0; i < totalSize; i++){
            for (int j = 0; j < totalSize; j++){
                sorted.add(scanner.nextInt());
                copy[i][j] = sorted.get(j);
            }

            Collections.sort(sorted);

            for (int k = 0; k < totalSize; k++){
                table[i][k] = sorted.get(k);
                if (solved && k != 0){
                    if (table[i][k] == table[i][k - 1]){
                        solved = false;
                    }
                }
            }

            sorted.clear();
        }

        if (solved){
            for (int i = 0; i < totalSize; i++){
                for (int j = 0; j < totalSize; j++){
                    sorted.add(copy[j][i]);
                }
                Collections.sort(sorted);
                for (int k = 0; k < totalSize; k++){
                    if (k != totalSize - 1){
                        if (sorted.get(k).equals(sorted.get(k + 1))){
                            solved = false;
                            break;
                        }
                    }
                }

                sorted.clear();
            }
        }

        if (solved){
            for (int i = 0; i < size; i++){
                for (int j = 0; j < size; j++){
                    sorted.add(copy[i][j]);
                }
            }

            Collections.sort(sorted);

            for (int i = 0; i < totalSize; i++){
                if (i != (totalSize - 1)){
                    if (sorted.get(i).equals(sorted.get(i + 1))){
                        solved = false;
                        break;
                    }
                }
            }
        }

        if (solved && table.length == 1){
            if (table[0][0] != 1) {
                solved = false;
            }
        }

        if (solved){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}