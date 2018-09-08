package Pattern;
import java.util.*;
public class pattern2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter numner ");
	int n=sc.nextInt();
	char ch='*';
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(ch+ "");
		}
		System.out.println();
	}
}
}
/*
enter numner 
5
*
**
***
****
*****

*/

