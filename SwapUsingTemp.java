// program for swapping two numbers;

public class SwapUsingTemp{
    public static void main(String arg[]){
       // Declare and Initialize variables:
        int a=9;
         int b=89;
         //Display numbers before Swapping:
        System.out.println("values of numbers before swapping:");
         System.out.println( + a +"  " +b);
//Swapping logic using Temp variable:
         int c=a;
         a=b;
        b=c;
        //Display values after Swapping:
        System.out.println("values of numbers after swapping:");
          System.out.println( +a +" " +b);

    }
    }
