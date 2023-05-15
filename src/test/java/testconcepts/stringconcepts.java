package testconcepts;

public class stringconcepts {

	public static void main(String[] args) {
		String s = "Automation";
		String S1 = "Tester";
		
		
		//to find length
		int l = s.length();
		System.out.println(l);
		
		//to find the position or index of character
		//NOte: value starts with 0,1,2,3,.....
		char c = s.charAt(2);
		System.out.println(c);
		
		//to comparing sting values
		// it always return value as boolean
		System.out.println(s.equals(S1));
		
		//contains means even if any single character match between s and S1 it will return value as TRUE
		System.out.println(s.contains(S1));
		
		//equalsIgnorecase is use to not consider case sensitive 
		System.out.println(s.equalsIgnoreCase(S1));
		
		//Change to lower case
		String s3 = s.toLowerCase();
		System.out.println(s3);
		System.out.println(s3.equals(S1));
		
		//Change to upper case
		System.out.println(s.toUpperCase());
		
		//to concat the strings
		System.out.println(s.concat(S1));
		//or
		System.out.println(s+S1);
		
		
		
		

	}

}
