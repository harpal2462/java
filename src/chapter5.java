import java.sql.Blob;

// Exception Handling  Methods functions

public class chapter5 {
    public static int mere(int a, int b) {
        int c=a+b;                                 // method with return type int
        return c;
        
    }
    public static void main(String []args) {
         int marks[]= {100,99,89};
         try{
             System.out.println(marks[5]);

         }
         catch(Exception e){
            System.out.println("bhai yha error hai");
            System.out.println(e.getLocalizedMessage());
            
         }
         System.out.println("Spartan are you ready");

         System.out.println(mere(marks[0], marks[1]));  // calling method(function)
 
    }
}

// catch(ArrayIndexOutOfBoundsException e){
//     System.out.println("bhai yha error hai");     // you can also use ArrayIndexOutOfBoundsException
//     System.out.println(e.getLocalizedMessage());
    
//  }