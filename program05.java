import java.util.Scanner;
class program07
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num=scob.nextInt();
if(num==1){System.out.print("JANUARY");}
else if(num==2){System.out.print("FEBRAURY");}
else if(num==3){System.out.print("MARCH");}
else if(num==4){System.out.print("APRIL");}
else if(num==5){System.out.print("MAY");}
else if(num==6){System.out.print("JUNE");}
else if(num==7){System.out.print("JULY");}
else if(num==8){System.out.print("AUGUST");}
else if(num==9){System.out.print("SEPTEMBER");}
else if(num==10){System.out.print("OCTOBER");}
else if(num==11){System.out.print("NOVMBER");}
else if(num==12){System.out.print("DECEMBER");}
else{System.out.print("INVALID");}
}
}