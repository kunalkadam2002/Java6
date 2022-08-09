import java.util.*;
class totalperconditional{
   public static void main(String args[]){
    int a,b,c,d,e,f,total,per;
    String str;
    Scanner d1= new Scanner(System.in);
    System.out.println("enter marks of 6 sub :");
    a=d1.nextInt();
    b=d1.nextInt();
    c=d1.nextInt();
    d=d1.nextInt();
    e=d1.nextInt();
    f=d1.nextInt();
    total=a+b+c+d+e+f;
    per =total/6;
    System.out.println("total = "+total);
    System.out.println("percentage ="+per+" %");
    str=(a>35 && b>35 && c>35 && d>35 && e>35 && e>35 && f>35)? "Pass":"Fail";
    System.out.println(str);

   }
    



}