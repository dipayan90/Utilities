package org.kajjoy.arrays.detectDuplicates;

public class NonRepeatedCharacterDetector {
	
	protected static char getNonRepeatedCharacter(String str,int n) throws Exception{
		char[] charArray = str.toCharArray();
		int[] tracker = new int[256];
		int[] res = new int[str.length()+1];
		int num = 1,index = 0;
		
		if(n > str.length()){
			throw new Exception("n cannot be more than the string length \n");
		}
		
		for(char c: charArray){
			tracker[(int)c] += 1;
		}
		
		for(int i : tracker){
			index++;
			if(i == 1){
				res[num++] = index;
			}
		}
		
		if(n > num){
			throw new Exception("Number of non repeated characters are less than n \n");
		}
		
		return (char)(res[n]-1);
	}

}
