import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        int R=0;
        System.out.println("Enter number");
        int a = aa.nextInt();

        System.out.println("Enter power");
        int n = aa.nextInt();

        Main obj = new Main();
        R = obj.power(a, n);
        System.out.println(R);
    }

    public static int power(int a,int n){
        if(n==0){
            return 1;
        }
        else{
            return a*power(a, n-1 );
        }
    }
}
