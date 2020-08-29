/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_calculator;

/**
 *
 * @author Sahishnu
 */
  import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String args[])
{
int a,b,ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of A and B");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter your choice for what you want to perform");
System.out.println("Enter 1 for Addition\n Enter 2 for Substraction\n Enter 3 for Multiplication\n Enter 4 for Division\n Enter 5 for find remainder\n Enter 6 for finding square & cuberoot");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Addition of " +a+ " and " +b+ " is : " +(a+b));
break;
case 2:
System.out.println("Substraction of " +a+ " and " +b+ " is : " +(a-b));
break;
case 3:
System.out.println("Multiplication of " +a+ " and " +b+ " is : " +(a*b));
break;
case 4:
System.out.println("Division of " +a+ " and " +b+ " is : " +(a/b));
break;
case 5:
System.out.println("Remainder of " +a+ " and " +b+ " is : " +(a%b));
break;
case 6:
System.out.println("Square root of "+a+" and "+b+" is: "+(a*a)+ " and "+(b*b) );
System.out.println("Cube root of "+a+" and "+b+" is: "+(a*a*a)+ " and "+(b*b*b) );
break;
default:
System.out.println("Invalid input given");
}
}
}
