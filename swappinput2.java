import java.util.*;
class swappinput2{
   public static void main(String args[]){
    int x,y;
    Scanner d1=new Scanner(System.in);
    System.out.print("enter value of x :");
    x=d1.nextInt();
    System.out.println("enter value of y :");
    y=d1.nextInt();
    System.out.println("Value of x and y before swapping x="+x+" and y="+y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.print("Value of x and y after swapping x= "+x+" and y="+y);
   }
}