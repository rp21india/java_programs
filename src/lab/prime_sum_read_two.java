package lab;
import  java.util.*;

public class prime_sum_read_two {
		 public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter start prime number");
			 int num=sc.nextInt();
			System.out.println("enter ending prime number");
		 int num2=sc.nextInt();	
		 int sum=0;
		for( int s1=num;s1<=num2;s1++) {
			boolean flag =false;
			for(int i=num;i<s1;i++) {	
				if(s1 % i == 0) {
					flag=true ;
					break;
			}
			}
			if(s1 == num) 
				sum=sum+s1;
			//	System.out.println(s1);
			}
			System.out.println(sum);

		}
}
 
			