package sts;

/*
 * Why the following loop will fail?
 * Answer:
 * There isn't variable with name "limit" -> Syntax error
 * Useless variable: "end"
 */
class Test   
{  
    public static void main (String args[])   
    {  
		
		/*
		
		int end = 0;
        for(int i=0; limit; i++)   
        {  
            System.out.println("Hello World");  
        } 
		
		
		*/
	
		// Solution
    	int end = 100;
        for(int i=0; i<=end; i++)   
        {  
            System.out.println("Hello World");  
        }  
    }  
}  