import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        int R=0;
        System.out.println("Enter number");
        int m = aa.nextInt();

        Main obj = new Main();
        R = obj.fib(m);
        System.out.println(R);
    }

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
