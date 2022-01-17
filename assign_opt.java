import java.util.*;

 class assign_opt
 {
   public static void main(String [] args)
   {
     int n1,n2;
     System.out.println("Enterb two numbers- \n");
     Scanner sc= new Scanner(System.in);
     n1=sc.nextInt();
     n2=sc.nextInt();
     n2+=n1;
     System.out.println(" value of n2+=n1 is ="+n2);
      n2-=n1;
     System.out.println("\n value of n2-=n1 is ="+n2);
      n2*=n1;
     System.out.println("\n value of n2*=n1 is ="+n2);
       n2/=n1;
     System.out.println("\n value of n2/=n1 is ="+n2);
       n2%=n1;
     System.out.println("\n value of n2%=n1 is ="+n2);
    }
}

/*
output -

D:\AnudipJavaPrograms>java assign_opt
Enterb two numbers-

10 5
value of n2+=n1 is =15

 value of n2-=n1 is =5

 value of n2*=n1 is =50

 value of n2/=n1 is =5

 value of n2%=n1 is =5
*/



     
   