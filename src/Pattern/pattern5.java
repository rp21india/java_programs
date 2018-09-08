package Pattern;
import java.util.*;
public class pattern5 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter numner ");
	int n=sc.nextInt();
	char ch='A';
	for(int i=n;i>=0;i--) {
		for(int j=i;j>=0;j--) {
			System.out.print(ch+ "");
		}
		ch++;
		System.out.println();
	}
}
}
/*
enter numner 
5
AAAAAA
BBBBB
CCCC
DDD
EE
F

*/

