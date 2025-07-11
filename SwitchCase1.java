class SwitchCase1{


//Switch case 
public static void main(String[] args)//function 
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enetr weeks");
int a=scn.nextInt();
switch(a)
{

   case 12:
   case 1:
   case 2:
          System.out.println("Winter Season");
          break;

   
   case 4:
   case 5:
   case 6:
          System.out.println("Summer Season");
          break;

   
   case 7:
   case 8:
   case 9:
          System.out.println("Rainy Season");
          break;
    default :

            System.out.println("Invalid input value");
}
}
}