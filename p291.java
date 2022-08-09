class Student{
   int roll;
   String name;
    Test t1=new Test();
   public void setrn(int x,String y){
    roll=x;
    name=y;
   }
  class Test{
    String sub;
    int mk;
    public void setsm(String m,int n){
       sub=m;
       mk=n;
    }
   public void show(){
     System.out.println("Roll ="+roll);
     System.out.println("Name ="+name);
     System.out.println("Subject ="+sub);
     System.out.println("Marks ="+mk);
   }
  }
}
class p291{
   public static void main(String args[]){
     Student s1=new Student();
     s1.setrn(101,"avantika");
     s1.t1.setsm("maths",100);
     s1.t1.show();
   }
}