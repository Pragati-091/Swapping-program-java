// Swapping of two numbers without using third varialbe:
public class swapwithoutthirdvariable {
    public static void main(String arg[]){
        // initialising and declaring variables:
        int a=40;
        int b=60;
        
        System.out.println("value of numbers before swapping:");
        System.out.println(+a +" " +b);
        // logic without using third variable:
        b=b+a;
        a=b-a;
        b=b-a;
        System.out.println(" value of numbers after swapping:");
        System.out.println(+a +" " +b);

    }
}
