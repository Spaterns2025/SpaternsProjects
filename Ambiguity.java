class Ambiguity{

//Method with return type
 public static double Method1(int i,int j){
double d=i+j;
 return d;
}

 public static int Method1(int i,int j){
int d=i+j;
 return d;
}
public static void main(String[] args)//function or method in java
{
Method1(37,83);
}
}