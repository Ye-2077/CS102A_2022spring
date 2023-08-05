import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int term = input.nextInt();
        int fibTermN = 0;
        int fib1 = 1;
        int fib2 = 1;
        if (term >= 3) {
            for (int i = 2; i < term; i++) {
                fibTermN = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibTermN;
            }
            System.out.println(fibTermN);
        }
        else {
            if (term == 0){
                System.out.println("0");
            } else if (term == 1 || term == 2) {
                System.out.println("1");
            }
        }
    }
}
