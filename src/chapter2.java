import java.util.Scanner;
public class chapter2 {
    public static void main(String[] args) {
        
        //user input
        
        Scanner sc = new Scanner(System.in);//start step 1
        System.out.print("Enter your name:");

        String name=sc.nextLine();//step 02
        int age =sc.nextInt();
        float weight =sc.nextFloat();
        double height=sc.nextDouble();
        boolean isadult= sc.nextBoolean();// write true or false
        char gender = sc.next().charAt(0); // takes first char input from string written
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(isadult);
        System.out.println(gender);
    }
}
