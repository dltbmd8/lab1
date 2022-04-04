import java.util.Scanner;

public class Main {

    public static void reverse(int[] a, int b, int c) {
        if(b>=c)
            return;
        int temp;
        temp=a[b];;
        a[b]=a[c];
        a[c]=temp;

        reverse(a,b+1, c-1);
    }

    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        int a[],size=0, R;
        System.out.println("Enter the size");
        size = aa.nextInt();
        a= new int[size];
        System.out.println("Enter all elements");
        for(int i=0; i<size; i++)
            a[i]=aa.nextInt();

        reverse(a,0,size-1);
        for(int i=0; i<size; i++)
            System.out.print(a[i]+" ");
    }

}
