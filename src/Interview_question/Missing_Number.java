package Interview_question;

public class Missing_Number {

	static int getMissingNo (int a[], int n) {
		int i, total;
		total= (n+1)*(n+2)/2;
		for(i=0;i<n;i++)
			total -= a[i];
		return total;
	}
	public static void main(String[] args) {
		int a[ ]= {1,2,3,5,6,7,8,9};
		int miss= getMissingNo(a, 8);
		System.out.println(miss);
	}
}
