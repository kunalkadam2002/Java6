import java.util.*;
class reverse3digitno{
   public static void main(String args[]){
    int a,x,y,z,m;
    Scanner sc =new Scanner(System.in);
    System.out.print("enter any 3 digit no :");
    a=sc.nextInt();
    z=a%10;
    a=a/10;
    y=a%10; 
    x=a/10;
    m=z*100+y*10+x;
    System.out.println("the reverse of no is :"+m);
   }
}