import java.util.*;
class votingconditional{
  public static void main(String args[]){
   int a;
   String s1;
   Scanner d1= new Scanner(System.in);
   System.out.println("enter age of the person :");
   a=d1.nextInt();
   s1=(a>18)?"person is eligible for voting":"person is not eligible for voting";
   System.out.println(s1);


  }

}