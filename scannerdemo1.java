import java.util.*;
class scannerdemo1{
  public static void main(String args[]){
   Scanner d1= new Scanner(System.in);
   int a;
   float b;
   long c;
   String s1;
   String s2;
   System.out.println("ENTER a string ");
   s1=d1.nextLine();
   System.out.println("Enter another string :");
   s2=d1.next();
   System.out.println("enter value of integer :");
   a
=d1.nextInt();
   System.out.println("enter value of float :");
   b=d1.nextFloat();
   System.out.println("enter value of long :");
   c=d1.nextLong();
   
   System.out.println("String 1= "+s1);
   System.out.println("String 2 ="+s2);
   System.out.println("A="+a);
   System.out.println("B="+b);
   System.out.println("C ="+c);




   }





}