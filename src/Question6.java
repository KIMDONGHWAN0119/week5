import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("값 입력 1: ");
        int num = sc.nextInt();
        System.out.print("값 입력 2 : ");
        int num2 = sc.nextInt();
        int i = num;

        if(num%i == 0 && num2%i == 0){
            System.out.println("최대공약수입니다." + i);
        }

        while(num % i != 0 && num2 % i != 0){
            System.out.println(i);
            if(num % i == 0 && num2 % i == 0){
                System.out.println("최대공약수입니다." + i);
            }
            i--;
        }
    }
}
