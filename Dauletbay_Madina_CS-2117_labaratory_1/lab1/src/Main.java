
import java.util.Scanner;

public class Main {

    int find(int a[], int min, int i){
        if(i == a.length)
            return min;
        if (min > a[i])
            min=a[i];
        return find (a, min,i+1);

    }
    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        int size, R=0;
        System.out.println("Enter the string");
        String s;
        s = aa.nextInt();

        Main obj = new Main();
        R = obj.find(a, a[0], 1);
        System.out.println(R + " is the smallest number ");
    }
}
