import java.util.Scanner;


public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        do{
            System.out.print("Enter an integer: ");
            n = sc.nextInt();
        }while(n != 1234);
        System.out.println("성공");
    }
}
