import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("값 입력 : ");
        int n = sc.nextInt();

        for (int i=2; i<=(n/2); i++) {
            if(n%i==0 && i!=n){
                System.out.println(n+"는 소수가 아닙니다.");
                System.exit(0);
            }
        }
        System.out.print("소수입니다.");
    }
}
