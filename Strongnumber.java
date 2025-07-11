class Strongnumber{


public static void main(String[] args)//function 
{

java.util.Scanner scn=new java.util.Scanner(System.in);
      System.out.println("Enter the number");
         int n=scn.nextInt();//145
           int s=n;
       int sum=0;//145
          while(n>0)
       {
          int r=n%10;//4
           int p=1;
           int q=1;
            while(p<=r)
               {
                   q=p*q;
                    p++; 
                }
               sum=sum+q;
             n=n/10;
        }
if(sum==s)
     {
    System.out.println(s+" is a Strong number");
}else{
System.out.println(s+" is not a Strong number");
}

}
}