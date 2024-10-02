import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = 0;
        do{
            n = sc.nextInt();
            if(n>=0){
                System.out.print("0 이상 입력됨");
            }
        }while(n>=0);
    }
}
