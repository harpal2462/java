import java.util.Random;

// final constant random in java

public class chapter4 {
    public static void main(String []args) {
        int a=45;
        float b=45.55f;
        float c= a+b;
        int d= a+ (int)b;
        // System.out.println(c); 
        // System.out.println(d);

        int age=19;

        final float PI=3.14f; // final is used to declare it as constant..now it will not be changed
        // PI=45; 
        System.out.println(Math.random()); // it will print double type random decimal b/w 0.0 to 1.0 like 0.54545626797942
        // so we will multiply it with 10 and type cast it to int for random no.n/w 0 to 100;
        System.out.println( (int)(Math.random()*100));
        // logical operators and&&   or||
        if(a==45 && b==45.55) System.out.println("hello");
        else System.out.println("ohh");

        switch(age){
            case 18: 
            System.out.println("your 18");
            break;
            case 19 :
            System.out.println("your age is 19");
            break;
            default:
            System.out.println("your in default");
        }

    }
}
