package lab;
import java.util.*;
public class reverse_element_array_86 {

	public static void main(String args[])
	   {
		int counter, i=0, j=0, temp;
		int number[] = new int[100];
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many elements you want to enter: ");
		counter = scanner.nextInt();

		/* This loop stores all the elements that we enter in an 
		 * the array number. First element is at number[0], second at 
		 * number[1] and so on
		 */
		for(i=0; i<counter; i++)
		{
		    System.out.print("Enter Array Element"+(i+1)+": ");
		    number[i] = scanner.nextInt();
		}

		/* Here we are writing the logic to swap first element with
		 * last element, second last element with second element and
		 * so on. On the first iteration of while loop i is the index 
		 * of first element and j is the index of last. On the second
		 * iteration i is the index of second and j is the index of 
		 * second last.
		 *              
		 */
		j = i - 1;     
		i = 0;         
		scanner.close();
		while(i<j)
		{
	  	   temp = number[i];
		   number[i] = number[j];
		   number[j] = temp;
		   i++;
		   j--;
		}

		System.out.print("Reversed array: ");
		for(i=0; i<counter; i++)
		{
		   System.out.print(number[i]+ "  ");
		}       
	   }
	}

/*output
* How many elements you want to enter: 5
	Enter Array Element1: 12345
	Enter Array Element2: 123456
	Enter Array Element3: 1235
	Enter Array Element4: 1454
	Enter Array Element5: 56
	Reversed array: 56  1454  1235  123456  12345   */