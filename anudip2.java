import java.util.*;
//import java.util.scanner;

class anudip2
{
  public static void main(String[] args)
  {
    int no1,no2,add,sub,mul,div;
    double mod;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st no.");
	no1=sc.nextInt();
	System.out.println("enter 2nd no.");
	no2=sc.nextInt();
	add=no1+no2;
	sub=no1-no2;
	mul=no1*no2;
	div=no1/no2;
	mod=no1%no2;
	System.out.println("addition is ="+add);
    System.out.println("substraction is ="+sub);
    System.out.println("multiplication is ="+mul);
	System.out.println("division of is ="+div);
	System.out.println("modulus of is ="+mod);
	}
}


/*
output - 

D:\AnudipJavaPrograms>java anudip2
enter 1st no.
12
enter 2nd no.
12
addition is =24
substraction is =0
multiplication is =144
division of is =1
modulus of is =0.0
*/	
