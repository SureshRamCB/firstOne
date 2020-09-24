package newProject1;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SumOfTheDigits {
	
	public void sumOfAllDigits() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to be added :");
		int number= sc.nextInt();
		int sum=0;
		while (number!=0) {
			sum=sum+(number%10);
			number=number/10;
		}
		System.out.println(sum);
	
	}
	@Test
	public void sumOfAllDigit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no tobe added:");
		int no=212455;
		int sum=0;
		while(no!=0){
		sum=sum+(no%10);
		no=no/10;
		}
		System.out.println(sum);
	}
	
	

}
