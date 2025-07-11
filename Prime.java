class Prime{


public static void main(String[] args)//function 
{

java.util.Scanner scn=new java.util.Scanner(System.in);
      System.out.println("Enter the number");
         int n=scn.nextInt();//11
int a=1;
for(int i=2;i<n;i++)
  {
       if(n%i==0)
            {
              a=0;
              break;
             }
       }
if(a==1)
      {
            System.out.println(n+" is a Prime number");
            }else{
                System.out.println(n+" is not a Prime number");
              }

   }
}