package Interview_question;
import java.util.Scanner;

public class factorial_Recursion {

	public static int factorial(int num ){
		int fact;
		if(num==1) {
			return num;}
		
		// recursion function calling 
			fact=factorial(num-1)*num;
			return fact;
		}
		
public static void main(String[] args) {
	System.out.println("ente number");
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	num=factorial(num);
	System.out.println(num);
	
	

}
}