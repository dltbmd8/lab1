import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        int n, k;
        System.out.println("Enter two numbers");
        n= aa.nextInt();
        k=aa.nextInt();
        System.out.print(gcd(n, k));
    }
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else if (x >= y && y > 0) {
            return gcd(y, (x % y));
        }
        else if(y>=x && x>0){
            int a=x;
            x=y;
            y=a;
            return gcd(y, (x % y));
        }
        return x;
    }
}
