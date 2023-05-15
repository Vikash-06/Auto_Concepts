package testconcepts;

public class reversestringwords {

	public static void main(String[] args) {
	
		String s = "Manish Automation";
		String rev = "";
		String []t = s.split(" ");
		
		int l = t.length;
		for (int i = l-1; i>=0; i--) {
			rev = rev+" "+t[i];
			
		}
System.out.println(rev);
	}

}
