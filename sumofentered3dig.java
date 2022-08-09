import java.util.*;
class sumofentered3dig{
  public static void main(String args[]){
   int m,n,y,r,p,z;
   Scanner sc= new Scanner(System.in);
   System.out.print("enter 4 digit no :");
   m=sc.nextInt();
   p=m%10;
   m=m/10;
   r=m%10;
   m=m/10;
   y=m%10;
   n=m/10;
   z=n+y+r+p;
   System.out.println("the sum of all digits is :"+z); 
  }
}