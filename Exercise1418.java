package passantino_CS401_A1;

public class Exercise1418 {
	public static void localMinimum(int[] a) {
		
		//check each value to see if the "middle" value is lower
		//than its neighbors
		for(int i=0; i< (a.length-2); i++) {
			if(a[i+1] < a[i] && a[i+1] < a[i+2]) {
				System.out.println("Local Minimum: " + a[i+1]);
			return;
			}
		}
	}
	
}
