class Sumofdigits{


public static void main(String[] args)//function 
{

java.util.Scanner scn=new java.util.Scanner(System.in);
      System.out.println("Enter the number");
         int n=scn.nextInt();//0
           int s=n;
       int sum=0;//20
       while(n>0)
      {
           
             int a= n%10;
               sum=sum+a;
                n=n/10;
           }

          System.out.println("The sum of digits of "+s+" is "+sum);

}
}