import java.util.*;
class salaryinput{
 public static void main(String args[]){
  int n,m,p;
  Scanner d1=new Scanner(System.in);
  System.out.println("enter the salary given to the employee :");
  n=d1.nextInt();
  System.out.println("enter no of days he worked : ");
  m=d1.nextInt();
  p=(n/m)*30;
  System.out.println("the total salary of employee is "+p);

 }




}