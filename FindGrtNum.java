import java.util.Scanner; //To import utility files for Scanner
class FindGrtNum
{
  public static void main(String a[])
  {
  Scanner sc=new Scanner(System.in); //To get keyboard input
  System.out.println("Enter only integer values");
  System.out.println("Enter First number");
  int num1=sc.nextInt(); //To assign first keyboard input
  System.out.println("Enter Second number");
  int num2=sc.nextInt(); //To assign second keyboard input
  System.out.println("Enter Third number");
  int num3=sc.nextInt(); //To assign third keyboard input
  if (num1>num2 && num1>num3) //condition1
    System.out.println(num1+" is greater than "+num2+" and "+num3);
  else if(num2>num3) //condition2
    System.out.println(num2+" is greater than "+num1+" and "+num3);
  else
    System.out.println(num3+" is greater than "+num1+" and "+num2);

  }
}
