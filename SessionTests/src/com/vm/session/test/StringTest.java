package com.vm.session.test;

public class StringTest {

	// count the words using split 
	
	public static int countWords(String input)
	{ 
		if (input == null || input.isEmpty())
		{
			return 0; 
		} 
		String[] words = input.split("\\s+"); 
		return words.length; 
	}

	public static void main(String[] args) {

		String str="Hello welcome to india";
		
		int count = 0;    
        
        //Counts each character except space    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("characters: " + count);   
		
		System.out.println("Words: "+countWords(str));
	}

}
