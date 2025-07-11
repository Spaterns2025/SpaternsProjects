class forloop10{

//for loop statment
public static void main(String[] args)//function 
{
   //Syntax
             int a=1;
        for(int i=1;i<=5;i++)//rows
            {
                  
                 for(int j=5;j>i;j--)//column
                   {
                      System.out.print(" ");
                    }
                 for(int k=1;k<=a;k++)
                     {
                     System.out.print("*");
                     }
                       a=a+2;
                      System.out.println();
              }
   }
}