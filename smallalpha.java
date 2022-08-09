class smallalpha{
  public static void main(String args[])
    throws Exception{
    char ch;
    System.out.println("enter a character :");
    ch=(char)System.in.read();
    if(ch>97 && ch<122){
      System.out.println("the character is small alphabet");
      }else{
     System.out.println("the character is not small alphabet");
     }
   }
}