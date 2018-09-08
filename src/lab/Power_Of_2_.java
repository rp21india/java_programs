package lab;
import java.util.*;
public class Power_Of_2_ {
public static void main(String[] args) {
	Scanner in  = new Scanner (System.in);
	System.out.println("enter number");
	int number=in.nextInt();
	while(number>1) {
		//for(;number>0;number++){	
	if(number % 2 != 0) {
			System.out.println("not a power of two");
			return;
		}
	number = number / 2;
	}
	System.out.println("\" power of two\"");
}
}
