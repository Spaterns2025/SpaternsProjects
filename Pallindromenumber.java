class Pallindromenumber{


public static void main(String[] args)//function 
{

java.util.Scanner scn=new java.util.Scanner(System.in);
      System.out.println("Enter the number");
         int n=scn.nextInt();//1234
           int s=n;
       int sum=0;//1234321
       while(n>0)
      {
           
             int a= n%10;
               sum=sum*10+a;
                n=n/10;
           }
       if(sum==s)
             {
          System.out.println(s+" is a Pallindrome number");
}else{


          System.out.println(s+" is  not a Pallindrome number");
}

}
}