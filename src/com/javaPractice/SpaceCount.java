package javaPractice;

public class SpaceCount {
	
	public static void main(String[] args) {
		
		String s= " Hey , How are  you? ";
		int count=0;
		
		char [] ch= s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]== ' ') {
				
				count++;
			}
			
		}
		System.out.println("Space="+ count);
		
		
	}

}
