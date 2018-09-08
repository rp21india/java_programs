package lab;
import java.util.*;
public class armstrong {
public static void main(String[] args) {
	Scanner scs= new Scanner(System.in);
	System.out.println("enter number");
	int num=scs.nextInt();
//	int num=153;
	int carry=0;
	int temp=num;
	while(num!=0) {
		int digit=num%10;
		carry=carry+(digit*digit*digit);
		num=num/10;
	}
	if(temp==carry) {
		System.out.println("this is armstrong");
	}else {
		System.out.println("this is not armstrong");
	}
	//System.out.println(carry);
}
}
