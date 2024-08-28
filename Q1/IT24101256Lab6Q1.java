import java.util.Scanner;
public class IT24101256Lab6Q1
{
 public static void main(String[]args)
 {
  //Create an object called an input to scanner class
  Scanner input=new Scanner(System.in);

  System.out.print("Enter a number:");
  double number=input.nextDouble();

  double square=number*number;
  double squareRoot=Math.sqrt(number);

  System.out.println("\nThe square of"+" "+number+" "+"is : "+ square);
  System.out.println("The square root of"+" "+number+" "+"is : "+ squareRoot);

  }
}