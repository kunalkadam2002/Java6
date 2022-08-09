import java.util.*;
class palindromeno{
  public static void main(String args[]){
    int n,d1,d2,d3,rev,y;
    String s1;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any 3 digit no :");
    n=sc.nextInt();
    int x=n;
    d3=n%10;
    n=n/10;
    d2=n%10;
    d1=n/10;
    rev=d3*100+d2*10+d1;
    
   s1=(rev==x)?"its a palindrome ":"its not a palindrome";
   System.out.println(s1);

  }








}