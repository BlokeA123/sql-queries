package blackjackother;

public class bj {

	public static void main(String[] args) {
		blackjack(2, 2);

	}

	public static void blackjack(int a, int b) {
		
		if(a>21) {
			a = 0;
		}
		
		if(b>21) {
			b = 0;
		}
		
	if(a>b) {
		System.out.println("A is greater than b! " + a);
	}else if(b>a) {
	    System.out.println("B is greater than a! "+ b);
	} else {
		System.out.println("A is equal to B | " + a + " and "+ b );
	}
			
		
		
		
		
	}

}
///*What to check
//1. if value one is greater than 21, its equal 0
//2. if value two is greater than 21, its equal to 0
//3. check if a is greater than b
//4. check if b is greater than a*/