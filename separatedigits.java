import java.util.*;
class separatedigits{
  public static void main(String args[]){
    int a,d1,d2;
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the no :");
   a=sc.nextInt();
   d2=a%10;
   d1=a/10;
   System.out.println("the first no is :"+d1);
   System.out.println("the second no is :"+d2);
  }
}