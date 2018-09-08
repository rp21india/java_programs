package Interview_question;
import java.util.*;
public class Armstrong {
		 public static void main(String[] args) {
			 System.out.println("enter armstrong");
			 Scanner sc =new Scanner(System.in);
			 int num=sc.nextInt();
			 int carry=0;
			 int temp=num;
			 while(num!=0) {
				 int digit=num%10;
				 carry=carry+(digit*digit*digit*digit);
				 num=num/10;
			 }
			 if(carry==temp)
			 System.out.println("yes");
			 else
				 System.out.println("no");
		 }				
		 }