import java.util.*; //To import utility files
class PatternPrint
{
  public static void main(String a[])
  {
  for(int i = 1; i <= 5; i++) //To count the number of rows
  {
    for(int j = 1; j <= 5; j++) //To count the number of columns
    {
    if( ((i==1)&&(j==1)) || //To position in 1,1 for printing *
        ((i==1)&&(j==5)) || //To position in 1,5 for printing *
        ((i==2)&&(j==2)) || //To position in 2,2 for printing *
        ((i==2)&&(j==4)) || //To position in 2,4 for printing *
        ((i==3)&&(j==3)) || //To position in 3,3 for printing *
        ((i==4)&&(j==2)) || //To position in 4,2 for printing *
        ((i==4)&&(j==4)) || //To position in 4,4 for printing * 
        ((i==5)&&(j==1)) || //To position in 5,1 for printing * 
        ((i==5)&&(j==5)) )  //To position in 5,5 for printing *
      System.out.print("*");
    else
      System.out.print(" ");
    }
  System.out.println();
  }
  }
}