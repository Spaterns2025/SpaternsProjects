class Armstrongnumber{


public static void main(String[] args)//function 
{

java.util.Scanner scn=new java.util.Scanner(System.in);
      System.out.println("Enter the number");
         int n=scn.nextInt();//153
           int s=n;
       int sum=0;//27
       while(n>0)
      {
           
             int a= n%10;
                 sum=sum+a*a*a;
                n=n/10;
           }
       if(sum==s)
             {
          System.out.println(s+" is a Armstrong number");
}else{


          System.out.println(s+" is  not a Armstrong number");
}

}
}