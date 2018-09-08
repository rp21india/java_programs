package Interview_question;
import java.util.*;

public class Prime_sum {
			 public static void main(String[] args) {
					Scanner sc= new Scanner(System.in);
					System.out.println("enter start number");
					int begin=sc.nextInt();	
					System.out.println("enter ending number");
					int end =sc.nextInt();
					int sum=0;
					for(int num=begin;num<=end;num++) {
						boolean flag = true;
						for(int i=2;i<num;i++) {
							if(num%i==0) {
								flag=false;
								break;
							}
						}
						if(flag)
							//System.out.println(num);
							sum=sum+num;
					}
			System.out.println(sum);
			 }
	}
