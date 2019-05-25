package passantino_CS401_A1;

public class Exercise1418 {
	public static void localMinimum(int[] a) {
	//the array length used is made to be indexable 
	//for simplicity
	int arrLength =a.length-1;
	int index = arrLength; //current index being compared
	int offset; //value added to current index to calculate next value

	//print value if only one item is in the array
	if(index == 0){
	foundMinimum(a[0], 0);
	return;	
	}
	
	//check the midpoint first, and half of the remaining
	//search space on one of the sides if the checked value
	//is not a midpoint
	index /= 2;
	offset = (arrLength-index)/2;
	
	if(a[index -1] < a[index]){  
	localMinimum(a, (index - offset));
	}else if(a[index+1] < a[index]){
	localMinimum(a, (index + offset));
	}else{
	foundMinimum(a[index], index);
	}

	}

	private static void localMinimum(int[] a, int index){
		int arrLength = a.length-1;
		int offset = (arrLength-index)/2;

		//if the index is 1 value away from the next
		//index, then the offset will calculate to 0,
		//so the offset must be incremented
		if((arrLength-index)==1)
			offset++;
		
		//if the index has gotten to one of the edges,
		//then the edge is a local minimum
		if(index == 0 || index == arrLength){
		foundMinimum(a[index], index);
		return;
		}
		
		//if the value to the left of the index is less than the index,
		//then the left side will contain a local minimum. 
		//If the value to the right of the index is less, than the right side 
		//will contain a local minimum.
		
		//These statements check the values next to the index and search the midpoint of the
		//next half of the array if it contains a local minimum 
		if(a[index -1] < a[index]){  
		localMinimum(a, (index - offset));
		}else if(a[index+1] < a[index]){
		localMinimum(a, (index + offset));
		}else{
		foundMinimum(a[index], index);
		}
	
		}

	private static void foundMinimum(int value, int location){
	System.out.println("Found local minimum: " + value + " at location: " +location);
	}
	
}
