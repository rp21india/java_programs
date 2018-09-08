package lab;
import  java.util.*;

public class Prime_or_Not {
		 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter start number");
		int num=sc.nextInt();	
		System.out.println("enter limit  number");
		int limit=sc.nextInt();
		int sum=0; 
		boolean flag=false;
		int i;
		for( i =num;i<=limit;i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
			if(flag)
				 sum=sum+num;
		}
			
			 System.out.println(sum);
		}
		
 }
			