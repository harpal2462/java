// ARRAY
import java.util.Scanner;

public class chapter3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        int sum=0;
        int mx=Integer.MIN_VALUE; // max assign value in java
        int mn=Integer.MAX_VALUE; // min assign value in java
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            mx=Math.max(mx,a[i]); // max function injava
            mn=Math.min(mn,a[i]); // max function injava
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println();

        System.out.println(mx);
        System.out.println(mn);
        
    }
}
