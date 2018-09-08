package lab;
import java.util.*;
public class test1 {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("enter number");
			int num1 = in.nextInt();
		//	int num2 = in.nextInt();
			int store=0;
			int temp=num1;
			while(num1!=0) {
				int digit=num1%10;
				store=store*10+digit;
				num1=num1/10;
			}
			if(temp == store)
				System.out.println("this is plaindrom");
			else
				System.out.println("not plaindrom");
		}
	}