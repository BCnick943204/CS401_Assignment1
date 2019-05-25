package passantino_CS401_A1;

public class Exercise1412 {

	/* Takes two sorted int arrays and returns the 
	 * elements that they have in common
	 */
	public void getEqualValues(int[] a, int[] b) {
		//return if a[] is completely out of the 
		//bounds of b[]
	if(a[0] > b[b.length-1] || a[a.length-1] < b[0]) {
		System.out.println("No matching elements");
		return;
	}
	//Goes through a[] and compares each element, a[i], 
	//to an element of b[], b[bIndex]. If a given
	//element a[i] is greater than an element b[bIndex]
	//the next element should be compared until the elements
	//are equal, b[] has no more elements, or a[i] < b[bIndex]
	//in which case the next element of a is selected
	int bIndex = 0;
	
	for(int i=0; i<a.length; i++) {
		
		while(a[i] > b[bIndex])
			bIndex++;
		
		if(a[i] == b[bIndex]) {
			System.out.println(a[i]);
			bIndex++;
		}
		
		//end the loop if b[] has no more elements
		if(bIndex >= b.length)
			break;
	}
		
	}

	
}
