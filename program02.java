import java.util.Scanner;
class program02
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1=scob.nextInt();
int inc=scob.nextInt();
int i;
i=0;
while(i<=num1)
{
System.out.print(i+",");
       i=i+inc;
   }
}
}