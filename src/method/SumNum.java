package method;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2=sc.nextInt();
		sum(num1,num2);
		sum(106,109);
//		int result=num1+num2;
//		System.out.println("Sum of the Numbers : "+result);
	}
	public static void sum(int n1,int n2) 
	{
		int result=n1+n2;
		System.out.println("Sum of the number : " + result);
	}
}
