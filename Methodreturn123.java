class Methodreturn123{

//Method with return type
 public static String Method1(String name){
 return name;
}
public static void main(String[] args)//function or method in java
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the String");
String s=scn.next();
String n=Method1(s);
System.out.println("My name is "+n);
}
}