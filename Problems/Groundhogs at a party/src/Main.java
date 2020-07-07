import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        if(cups < 10){
            System.out.println(false);
        } else if (weekend){
            System.out.println(14 < cups && cups <= 25);
        } else {
            System.out.println(cups <= 20);
        }
    }
}