import java.util.*;
class tempinput{
  public static void main(String args[]){
   float F,C;
   Scanner d1=new Scanner(System.in);
   System.out.print("enter farhenite temperature :");
   F=d1.nextFloat();
   C=5*(F -32)/9;
   System.out.println("the temperature in celcius :"+C);
  }
}