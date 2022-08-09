import java.util.*;
class tempinput2{
 public static void main(String args[]){
    float F,C;
    Scanner d1=new Scanner(System.in);
    System.out.println("enter farhenite temperature :");
    C=d1.nextFloat();
    F=9/5*C+32;
    System.out.println("the temperature in farhenite is : "+F);
  }
}