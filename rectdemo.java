class Rectangle{

int len ,wid;
   void setdata(int x,int y){
   len=x;
   wid=y;
   }
   void show(){
    System.out.println("the length of the rectengle is ="+len);
    System.out.println("the width of the rectangle is ="+wid);
   }
}

class rectdemo{
 public static void main(String args[]){
   Rectangle a;
   a= new Rectangle();
   a.setdata(10,29);
   a.show();
   }

}