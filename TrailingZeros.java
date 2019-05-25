package passantino_CS401_A1;

public class TrailingZeros {
	
	public int getTrailingZeroSum(int n) {
		
		if(n < 0) //negatives are not being evaluated
			return 0;
		
		if(n % 2 != 0) //Check if it is even
			n -= 1;
		
		if(powerOf2(n)) //if it is a power of 2, the sum of the trailing zeros
			return n-1 ;   // is equal to that number minus 1
		
		int trlZeros = 0; //running sum of trailing zeros
		int nearestLog = 0; //holds the nearest log base 2 of current n
		int nearestPowTwo; // holds 2 to power of nearestLog
		
		 
		while(n > 0) {
			
			//find the power of 2 that is closest to n
			nearestLog = (int) (log2(n));
			nearestPowTwo = power2(nearestLog);

			//because a power of two is equal to it's trailing zero sum minus 1,
			//this value can be added to the trailing zeros 
			trlZeros += nearestPowTwo - 1;

			//n is a sum of powers of two, and each power of two has a corresponding
			//amount of trailing zeros. Once a given power of two's trailing zeros have
			//been added, that power of two can be subtracted from n so the next power of 
			//two can be accounted for
			n = n - nearestPowTwo;
			
		}
		
			return trlZeros;

	
	}
	
	//return true if the number is a power of 2
	private boolean powerOf2(int n) {
		double log = (Math.log(n) / Math.log(2));
		if(log % 1 == 0) //number is whole
			return true;
		else
			return false;
	}
	
	//return the log base 2 of an int n
	private double log2(int n) {
		return (Math.log(n) / Math.log(2));
	}
	
	//return 2 raised to the nth power
	private int power2(int n) {
		int power = 1;
		for(int i=0; i<n; i++) {
			power *= 2;
		}
		return power;
	}
}
