package javaPractice;

public class AlphaCount {

	public static void main(String[] args) {
		
		String s="WelcomE To AutomatioN";
		String lower="";
		String upper="";
		int up=0;
	    int lo=0;
	    int space=0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch= s.charAt(i);
			
			if(ch>=65 && ch<=90) {
				
				upper= upper+ch;
				up++;
			}
			if(ch!=32 && ch>=97 && ch<=122) {
				
				lower= lower+ch;
				lo++;
			}
		}
		
		System.out.println("uppercase="+upper);
		System.out.println("lowercase="+lower);
		System.out.println("uppercount="+up);
		System.out.println("lowercount="+lo);
		
	}
	
}
