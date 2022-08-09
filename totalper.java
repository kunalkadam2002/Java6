import java.util.*;
class totalper{
  public static void main(String args[]){
   int a,b,c,d,e,f,T,P;
   Scanner d1=new Scanner(System.in);

   System.out.println("enter mark of 1st sub");
   a=d1.nextInt();
   System.out.println("enter mark of 2nd sub");
   b=d1.nextInt();
   System.out.println("enter mark of 3rd sub");
   c=d1.nextInt();
   System.out.println("enter mark of 4th sub");
   d=d1.nextInt();
   System.out.println("enter mark of 5th sub");
   e=d1.nextInt();
   System.out.println("enter mark of 6th sub");
   f=d1.nextInt();
   
    T= a+b+c+d+e+f;
    System.out.println("the total marks of student :"+T);
    P=100*T/600;
    System.out.println("the average of student is :"+P);
  }
}