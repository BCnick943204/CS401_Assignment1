package passantino_CS401_A1;

public class TrailingZeros {
	
	public int getTrailingZeroSum(int n) {
		
		if(n < 0) //negatives are not being evaluated
			return 0;
		
		if(n % 2 != 0) //Check if it is even
			n -= 1;
		
		if(powerOf2(n)) //if it is a power of 2, the sum of the trailing zeros
			return n;   // is equal to that number
		
		int trlZeros = 1;
		int log = 0;
		int pow;
		
		/* Since powers of 2 are the value of the sum of the trailing zeros (or power of 2, minus 1 if not including
		 * 0 in the sum) the number can be subtracted a power of 2 that is less than it, continually
		 *  until it is zero (with the corresponding trailing zeros being added with each subtraction)
		 * */
		 
		while(n > 0) {
			
			log = (int) (log2(n));
			pow = power2(log);
			n = n - pow; // take away nearest power of 2
			trlZeros += pow - 1;
			
		}
		
			return trlZeros;

	
	}
	
	private boolean powerOf2(int n) {
		double log = (Math.log(n) / Math.log(2));
		if(log % 1 == 0) //number is whole
			return true;
		else
			return false;
	}
	
	private double log2(int n) {
		return (Math.log(n) / Math.log(2));
	}
	
	private int power2(int n) {
		int power = 1;
		for(int i=0; i<n; i++) {
			power *= 2;
		}
		return power;
	}
}
