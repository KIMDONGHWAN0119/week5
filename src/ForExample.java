public class ForExample {
    public static void main(String[] args) {
        int gongback = 1;
        for (int i = 1; i <= 9; i+=2) {
            for(int j=1; j<=gongback; j++){
                System.out.print(" ");
            }
            gongback++;
            for(int j=9; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}