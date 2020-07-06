import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] companies = new int[size];
        int[] taxes = new int[size];
        int max = 0;
        int company = 0;

        for (int i = 0; i < size; i++){
            companies[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++){
            taxes[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++){
            if (companies[i] * taxes[i] > max){
                max = companies[i] * taxes[i];
                company = i + 1;
            }
        }

        System.out.println(company);
    }
}