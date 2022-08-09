import java.util.*;
class sumofcube{
  public static void main(String args[]){
   int n,x,y,z,m;
    Scanner sc= new Scanner(System.in);
     System.out.println("enter any 3 digit no :");
    n=sc.nextInt();
    x=n%10;
    n=n/10;
    y=n%10;
    z=n/10;
    m=x*x*x+y*y*y+z*z*z;
    System.out.println("the sum of cube of nos is :"+m);
  }
 }
