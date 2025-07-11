class forloop9{

//for loop statment
public static void main(String[] args)//function 
{
   //Syntax
        for(int i=1;i<=5;i++)//rows
            {
                 for(int j=5;j>i;j--)//column
                   {
                      System.out.print(" ");
                    }
                 for(int k=1;k<=i;k++)
                     {
                     System.out.print("* ");
                     }
                      System.out.println();
              }
   }
}