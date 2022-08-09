import java.util.*;
class reverse4dig{
   public static void main(String args[]){
     int a,x,y,z,m,rev;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter 4 digit no :");
     a=sc.nextInt();
     m=a%10;
     a=a/10;
     z=a%10;
     a=a/10;
     y=a%10;
    x=a/10;
    rev=m*1000+z*100+y*10+x; 
   System.out.println("the rev of no is :"+rev);
   }
}