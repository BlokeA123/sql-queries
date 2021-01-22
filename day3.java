package day3;

public class day3 {

	public static void main(String[] args) {
		System.out.println("The sum of your integers is : " + unique(100, 9, 1));

	}

	public static int unique(int a, int b, int c) {
		int sum = 0;
		if(a != b && a != c) {
		    sum += a;
		}
		if(b != c && b != a) {
		    sum += b;
		}
		if(c != a && c != b) {
		    sum += c;
		}
		
		return sum;
	}
}
