import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if(input > -15 && input <= 12){
            System.out.println("True");
        } else if (input > 14 && input < 17){
            System.out.println("True");
        } else if (input >= 19){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}