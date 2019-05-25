package passantino_CS401_A1;

public class StringPatternMatcher {
	public static void match(String t, String p) {
		//Indexes where the first char of the
		//pattern is in the string if it is found
		//if firstChar is -1 then no pattern has begun to 
		//be found
		int firstChar = -1;
		//pIndex keeps track of how many characters
		//in a row have matched the pattern
		int pIndex=0;
		
		for(int i=0;i<t.length(); i++) {
				
			//if pIndex is equal to p.length()
			//the pattern has been found
			if(pIndex == p.length())
				break;
			
				if(t.charAt(i) == p.charAt(pIndex)) {
					
					if(firstChar == -1) //no pattern has been found
						firstChar = i;
										
					pIndex++;
				} else {
					firstChar = -1;
					pIndex = 0;
				}

		}

		if(pIndex == p.length()) {
			System.out.println("Pattern Found at " + firstChar + ", " + (firstChar + (p.length()-1)));
		}else
			System.out.println("No pattern was found");

	}
	
}
