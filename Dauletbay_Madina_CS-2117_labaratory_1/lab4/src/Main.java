import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        int n;
        int R=0;
        System.out.println("Enter number");
        n = aa.nextInt();

        Main obj = new Main();
        R = obj.factorial(n);
        System.out.println(R);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
