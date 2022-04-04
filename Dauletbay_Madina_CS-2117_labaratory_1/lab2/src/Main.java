
import java.util.Scanner;

public class Main {

    double find(int[] a, int size, int i){
        double sum=0, length =0;
        double c;
        for(i=0; i<size; i++){
            sum+=a[i];
        }
        c=sum/size;
        return c;
    }
    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        int a[];
        int size=0;
        double R=0;
        System.out.println("Enter the size");
        size = aa.nextInt();
        a= new int[size];
        System.out.println("Enter all elements");
        for(int i=0; i<size; i++)
            a[i]=aa.nextInt();

        Main obj = new Main();
        R = obj.find(a, size, 1);
        System.out.println(R + " is the average of array");
    }
}
