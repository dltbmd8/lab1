import java.util.Scanner;

public class Main {

    public static int bin(int n, int k) {
            if (k==n || k==0)
                return 1;
            else return bin(n-1,k-1) + bin(n-1, k);
    }

    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        int n, k;
        System.out.println("Enter n");
        n= aa.nextInt();
        System.out.println("Enter k");
        k=aa.nextInt();
        System.out.print(bin(n, k));
    }

}

