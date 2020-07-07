import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minSleep = scanner.nextInt();
        int maxSleep = scanner.nextInt();
        int sleep = scanner.nextInt();

        if (sleep > maxSleep){
            System.out.println("Excess");
        } else if (sleep < minSleep){
            System.out.printf("Deficiency");
        } else {
            System.out.println("Normal");
        }
    }
}