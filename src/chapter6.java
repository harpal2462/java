import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class chapter6 {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        int mynumber=(int)(Math.random()*100);
        int userno=0;
        
        do{
            System.out.println("guess a no.");
            userno=sc.nextInt();
            if(userno==mynumber){
                System.out.println("Congratulation you entered correct number");
                break;

            } else if(userno>mynumber){
                System.out.println("your no is bigger");
            }else{
                System.out.println("Your no is smaller");
            }
        } while(userno >=0);

        System.out.print("Actual no is: ");
        System.out.println(mynumber);
        System.out.print("your no is: ");
        System.out.println(userno);

        // int i = scan.nextInt();
        // double d = scan.nextDouble();
        // scan.nextLine();
        // String s = scan.nextLine();

        // System.out.println("String: " + s);
        // System.out.println("Double: " + d);
        // System.out.println("Int: " + i);
        
        
        
    }
}
