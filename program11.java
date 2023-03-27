import java.util.Scanner;
class program11
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1=scob.nextInt();
int num2=scob.nextInt();
int i=0;
while(i<5)
switch(choice)
{
System.out.print("1:Addition");
System.out.print("2:Substraction");
System.out.print("3:Multiplication");
System.out.print("4:Division");
System.out.print("5:modulus Division");
int choice=scob.nextInt();
switch(choice)
{
case 1:System.out.println(num1+"+"+num2+"="+(num1+num2));
case 2:System.out.println(num1+"-"+num2+"="+(num1-num2));
case 3:System.out.println(num1+"*"+num2+"="+(num1*num2));
case 4:System.out.println(num1+"/"+num2+"="+(num1/num2));
case 5:System.out.println(num1+"%"+num2+"="+(num1%num2));
i=i+1;
}
}
}

