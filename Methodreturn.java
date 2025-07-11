class Methodreturn{

//Method with return type
 public static int Method1(int i,int j){
   int sum=i+j;
 return sum;
}
public static void main(String[] args)//function or method in java
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter 1st value");
int a=scn.nextInt();
System.out.println("Enter 2nd value");
int b=scn.nextInt();
int s=Method1(a,b);
System.out.println("The sum of "+a+" and "+b +" is "+s);
int s1=Method2(a,b);
System.out.println("The Subtraction of "+a+" and "+b +" is "+s1);
}
//Method with return type
 public static int Method2(int i,int j){
   int sum=i-j;
 return sum;
}

}