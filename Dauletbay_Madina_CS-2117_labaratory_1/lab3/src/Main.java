import java.util.Scanner;

public class Main {

    int find(int a){
        boolean isprime=true;
        if(a<=1)
            System.out.println("Number should be greater than 1");
        else {
            for (int div=2; div<=(a/2); div++){
                if(a%div==0) {
                    isprime=false;
                    break;
                }
            }
            if(isprime)
                System.out.println("Prime");
            else
                System.out.println("Composite");
        }
        return 0;
    }
    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        int a;
        double R=0;
        System.out.println("Enter number");
        a = aa.nextInt();

        Main obj = new Main();
        R = obj.find(a);
        System.out.println(R);
    }
}
