import java.util.*;
class squareifelse{
   public static void main(String args[]){
     int n,sq;
     Scanner d1= new Scanner(System.in);
     System.out.println("enter any no :");
     n=d1.nextInt();
     if(n>0){
      sq=n*n;
      System.out.println("the square is :"+sq);
     }else{
       System.out.println("plz enter +ve no");
       }
   }
}