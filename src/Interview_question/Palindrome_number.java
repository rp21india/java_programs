package Interview_question;
import java.util.Scanner;

public class Palindrome_number {
	public static void main(String[] args) {
		System.out.println("ente number");
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();

	int plaindrome=0;
	int temp=num;
	while(num!=0) {
		int digit=num%10;
		plaindrome = plaindrome*10+digit;
		num=num/10;
	}
	if(temp==plaindrome) 
		System.out.println("yes");
	else 
		System.out.println("no");

	}
	}
