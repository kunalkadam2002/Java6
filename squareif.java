import java.util.*;
class squareif{
  public static void main(String args[]){
   int n,sq;
   Scanner d1=new Scanner(System.in);
   System.out.println("enter the no :");
   n=d1.nextInt();
   if(n>0){
    sq=n*n;
    System.out.println("the square of no is :"+sq);
    }
  }
}