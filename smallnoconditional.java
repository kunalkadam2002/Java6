import java.util.*;
class smallnoconditional{
  public static void main(String args[]){
   int a,b,c;
   Scanner d1= new Scanner(System.in);
   System.out.println("enter 1st no :");
   a=d1.nextInt();
   System.out.println("enter 2nd no :");
   b=d1.nextInt();
   c=(a<b)? a :b;
   System.out.println("the smaller no is "+c);

  }




}