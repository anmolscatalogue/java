package loops;
import java.util.Scanner;

public class tables {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        int i;
        for (i=1 ; i<=10;i++){
            System.out.println(i*n);
        }

    }
}
