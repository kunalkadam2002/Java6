import java.util.*;
class rev5dig{
  public static void main(String args[]){
    int n,d1,d2,d3,d4,d5,x;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 5 digit no :");
      n=sc.nextInt();
      d5=n%10;
      n=n/10;
      d4=n%10;
      n=n/10;
      d3=n%10;
      n=n/10;
      d2=n%10;
      d1=n/10;
     
     x=d5*10000 + d4*1000 + d3*100 +d2*10 + d1;
     System.out.println("the reverse of 5 digit no is :"+x);
  }
}