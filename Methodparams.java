class Methodparams{


 public static void Method1(int i,int j,int k){
//System.out.println("Method1 in Sample Function class i="+i +",j="+j+",k="+k);
}
public static void main(String[] args)//function or method in java
{

java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter value");
int a=scn.nextInt();
System.out.println("Enter value");
int b=scn.nextInt();
System.out.println("Enter value");
int c=scn.nextInt();
System.out.println("Main starts");
Method1(a,b,c);
//Method4("Deepesh",3283.293);

System.out.println("Main Ends");


}

 public static void Method4(double d,String s){
System.out.println("Method4 in Sample Function class d="+d+"name="+s);
}

}