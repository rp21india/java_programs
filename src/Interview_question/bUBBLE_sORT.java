package Interview_question;
import java.util.*;
public class bUBBLE_sORT {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int swap;
		int array[] = new int[num];
		System.out.println("enter"+ num+ " integer");
		
		for(int i=0; i<num;i++)
			array[i]=sc.nextInt();
		
		for(int i=0;i<num;i++) {
				for(int j=0;j<num-1-i;j++) {
					if(array[j] >array[j+1]) {
						swap=array[j];
						array[j]=array[j+1];
						array[j+1]=swap;
					}
				
				}
		 }
		
		System.out.println("reverse array ");
		for(int i = 0;i<num;i++)
		System.out.println(array[i]+" ");
		
	}
}