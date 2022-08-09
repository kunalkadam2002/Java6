import java.util.*;
class totalperifelse{
  public static void main(String args[]){
    int a,b,c,d,e,f,tot,per,rem;
    Scanner d1=new Scanner(System.in);
    System.out.println("enter marks of 6 sub:");
    a=d1.nextInt();
    b=d1.nextInt();
    c=d1.nextInt();
    d=d1.nextInt();
    e=d1.nextInt();
    f=d1.nextInt();
    tot=a+b+c+d+e+f;
    per=tot/6;
    if(a>35&&b>35&&c>35&&d>35&&e>35&&f>35){
    System.out.println("pass ");
    } else{
     System.out.println("fail");
   }

 
  }
}