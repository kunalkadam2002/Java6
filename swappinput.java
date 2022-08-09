import java.util.*;
class swappinput{
   public static void main(String args[]){
    int x,y,z;
    Scanner d1=new Scanner(System.in);
    System.out.print("enter value of x: ");
    x=d1.nextInt();
   System.out.print("enter value of y:");
   y=d1.nextInt();
   System.out.println("the vaue of x and y before swapping x ="+x+"and y = "+y);
   z=x;
   x=y;
   y=z;
   System.out.println("the value of x and y after swapping x="+x+" and y= "+y);
  }
}