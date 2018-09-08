package lab;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter factorial number");
		int num= sc.nextInt();
		int fact=1;
		for(int i=fact;i<=num;i++) {
			fact = fact*i;
		}
System.out.println(fact);
		
		
		
	// while loop
	Scanner in = new Scanner(System.in);
	System.out.println("enter number");
	int num1 = in.nextInt();
	int fact1=1;
	int i=1;
	while(i<=num1) {
		fact1 =fact1*i;
		i++;
	}
	System.out.println("factorial " + fact1);
}}
