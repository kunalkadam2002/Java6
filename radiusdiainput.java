import java.util.*;
class radiusdiainput{
   public static void main(String args[]){
     float a,r,d;
     Scanner d1=new Scanner(System.in);
     System.out.println("enter area of circle:");
     a=d1.nextFloat();
     r=(float)Math.sqrt(a/3.14);
     System.out.println("the radius of circle is :"+r);
     d=2*r;
     System.out.println("the diametere of circle is :"+d);
   }
}