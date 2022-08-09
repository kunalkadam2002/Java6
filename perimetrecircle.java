import java.util.*;
class perimetrecircle{
  public static void main(String args[]){
  float r,a,p;
   Scanner d1= new Scanner(System.in);
   System.out.print("enter radius of circle :");
   r=d1.nextFloat();
   a=(float)3.14*r*r;
   p=2*(float)3.14*r;
   System.out.println("the area of circle is :"+a);
   System.out.println("the perimetre of circle is :"+p);
   }

}