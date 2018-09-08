package lab;
import java.util.*;
public class reverse_string_68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr string ");
		String name = sc.nextLine();
		int length = name.length();
		String arr[]=new String[length];
		for (int i=0;i<length;i++){
			arr[i]=String.valueOf(name.charAt(i));
		}
		System.out.println("String reverse :");
		for(int j=length-1;j>=0;j--){
			System.out.print(arr[j]+"");
			
		}
	}
}
