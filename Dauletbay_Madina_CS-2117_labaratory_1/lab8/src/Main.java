import java.util.Scanner;

public class Main {

    String find(String str, int size, char[] y){
        int i=0;
        while(i!=size){
            if(y[i]>='0' && y[i]<='9'){
                ++i;
            }
            else{
                System.out.println("No");
                find (str, size, y);
            }
        }
        return ("Yes");
    }
    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        System.out.println("Enter the string");
        String s;
        s = String.valueOf(aa.nextInt());
        char y[]=s.toCharArray();
        int size=y.length;
        Main obj = new Main();
        System.out.println(obj.find(s, size, y));
    }
}

