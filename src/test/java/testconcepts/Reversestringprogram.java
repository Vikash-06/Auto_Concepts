package testconcepts;

public class Reversestringprogram {

	public static void main(String[] args) {
		 String s = "Transformers";
		 String reverse = "";
		int len = s.length();
		for (int i=len-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
			
		}
		 
System.out.println(reverse);
	} 

}
