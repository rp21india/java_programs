package lab;
import java.util.*;
public class plaindrom {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	//System.out.println("enter");
	//int num= sc.nextInt();
	int num=12345;
	int sum=0;
	int num1=num;
	while(num!=0) {
		int digit = num%10;
		sum=sum*10+digit;
		num=num/10;
	}
	//System.out.println(sum);
	if(num1==sum) {
		System.out.println("this is plaindrom");
		}else {
			System.out.println("not plaindrom");
		}
	}
}
