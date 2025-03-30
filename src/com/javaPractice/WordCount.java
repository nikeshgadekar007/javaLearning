package javaPractice;

public class WordCount {
	
	public static void main(String[] args) {
		
		String s= " Hey , How are  you? ";
		int word=0;
		
		for(int i=0;i<s.length()-1;i++) {
			
			char ch1=s.charAt(i);
			char ch2=s.charAt(i+1);
			
			if(ch1!=' ' && ch2==' ') {
				
				word++;
			}
				
		}
		
		System.out.println(word);
	}

}
