import java.util.Scanner;
public class IT24101256Lab6Q2B
{
 public static void main(String[]args)
 {
  //Create an object called input to scanner class
  Scanner input=new Scanner(System.in);

  System.out.println("Please enter 10 numbers:");
  int[] numbers = new int[10];

  for(int i=0;i< 10; i++)
  {
   System.out.print("Enter number"+" "+(i+1)+":"+" ");
   numbers[i]=input.nextInt();
  }

  System.out.println("\nThe numbers you entered are:");
  for(int i=0;i<10;i++)
  {
   System.out.print(numbers[i]+" ");
  }
 }
}