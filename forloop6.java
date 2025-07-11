class forloop6{

//for loop statment
public static void main(String[] args)//function 
{
   //Syntax
        for(int i=1;i<=5;i++)//rows
            {
                 for(int j=1;j<=5;j++)//column
                   {
                     if(i==1||i==5||j==1||j==5)
                       {
                        System.out.print("*");
                       }else{
                       System.out.print(" ");
                            }

                   }
                      System.out.println();
             }
  }
}