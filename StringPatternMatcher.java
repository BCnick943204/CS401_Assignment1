package passantino_CS401_A1;

public class StringPatternMatcher {
	public static void match(String t, String p) {
		String found = null;
		int firstChar = -1;
		int i=0;
		int j=0;
		for(;i<=(t.length()-p.length()); i++) {
				
				if(t.charAt(i) == p.charAt(j)) {
					if(firstChar == -1)
						firstChar = i;
					
					found += t.charAt(i);
					j++;
				} else {
					found = null;
					firstChar = -1;
					j = 0;
				}

		}
		if(found != null)
			System.out.println("Pattern Found at " + firstChar + ", " + (firstChar + (p.length()-1)));
	}
	
	//private static void checkForChar(char c, string )
}
