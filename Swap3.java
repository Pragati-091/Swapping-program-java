import java.util.Scanner;
public class Swap3 {
    // taking input from user:
    public static void main(String arg[]){

    
    Scanner Sc= new  Scanner(System.in);
    int  a = Sc.nextInt();
        int b = Sc.nextInt();
b=a+b-(a=b);// single line logic
System.out.println("value after swapping");
System.out.println(+a +" " +b);
   }
}

