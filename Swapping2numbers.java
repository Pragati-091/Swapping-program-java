//Programm for swapping two numbers without using third variable:
public class Swapping2numbers {
  public static void main(String arg[]){
    //DECLARE AND INITIALISE   VARIABLES:
int c=40;
int d=15;

System.out.println("numbers before swapping");
System.out.println(+c +" " +d);
// logic  for swapping two numbers:
c=c*d;
d=c/d;
c=c/d;
System.out.println("numbers after Swapping:");
System.out.println(+c +" " +d);


  }  
}
