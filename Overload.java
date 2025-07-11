class Overload{

//Method Overloading in java
//Method with return type

 public static int Method1(int i){
 return i;
}

 public static int Method1(int i,int j){
int k=i+j;
 return k;
}
public static int Method1(int i,int j,int k){
int r=i+j+k;
 return r;
}
public static void main(String[] args)//function or method in java
{

System.out.println(Method1(37));
}
}