import java.util.Scanner;
public class IT24101256Lab6Q2C
{
 public static void main(String[]args)
 {
  //Create an object called input to scanner class
  Scanner input=new Scanner(System.in);

  System.out.println("Please enter 10 numbers:");
  int[] numbers = new int[10];
  int sum=0;

   for(int i=0;i< 10; i++)
   {
    System.out.print("Enter number"+" "+(i+1)+":"+" ");
    numbers[i]=input.nextInt();
    sum += numbers[i];
   }
   double average=sum/10.0;

   System.out.println("\nThe numbers you entered are:");
   for(int i=0;i<10;i++)
   {
    System.out.print(numbers[i]+" ");
   }
 
   System.out.println("\nSum of the numbers:"+sum);
   System.out.println("Average of the numbers:"+average);
  }
}


