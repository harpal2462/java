public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String n1="Harpalsinh";
        String n2="Chauhan";
        
        int a=3444;
        float b=55.55f;
        char c='X';
        long y = 5555555555l;
        double z = 55.5343455d;
        
        // Strings
        System.out.println(n1+ " " +n2);
        System.out.print("no. of characters in string n1 is: " );

        System.out.println(n1.length()); //10
        System.out.println(n1.replace('H','Z')); //Zarpalsinh
        System.out.println(n1.charAt(0)); //H
        System.out.println(n1); // Harpalsinh
        
        //SubStings
        System.out.println(n1.substring(0, 7)); //Harpals...0 included and 6th index i.e s is not include so +1index 7
        System.out.println(n1.substring(6, 10)); // sinh

        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(y);
        System.out.println(z);
    }
}
