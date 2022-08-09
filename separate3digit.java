import java.util.*;
class separate3digit{
  public static void main(String args[]){
    int a,x,y,z;
    Scanner d1= new Scanner(System.in);
    System.out.print("enter any no :");
    a=d1.nextInt();
    z=a%10;
    a=a/10;
    y=a%10;
    x=a/10;
  System.out.println("the value of first no is :"+x);
  System.out.println("the value of second no is :"+y);
  System.out.println("the value of third no is :"+z);
  }
}