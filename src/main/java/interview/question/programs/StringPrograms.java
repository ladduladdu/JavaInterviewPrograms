package interview.question.programs;

public class StringPrograms {

	public static void main(String[] args) {
		
		/*System.out.println("converting string to integer ");
		
		String s="100";
		int i=Integer.parseInt(s);
        System.out.println(i);
        
        System.out.println("converting integer to string ");
         int j=100;
         String s1=String.valueOf(j);
         System.out.println(s1);
        
         System.out.println("converting string to float ");
       
		float f=Float.parseFloat(s);
		System.out.println(f);
		//float to string
		String s3=String.valueOf(f);
		System.out.println(s3);
		
		System.out.println("converting string to double ");
		double d=Double.parseDouble(s);
		System.out.println(d);
		//double to string
		String s4=String.valueOf(d);
		System.out.println(s4);
		
		// String to boolean
		
		System.out.println("converting string to boolean ");
		boolean b=Boolean.parseBoolean(s);
		System.out.println(b);
		
		// boolean to string
		boolean tr=true;
		String s2=Boolean.toString(tr);
		System.out.println(s2);
		
		//converting string to long
		long lg=Long.parseLong(s);
		System.out.println(lg);
		
		//long to string
		String s5=String.valueOf(lg);
		System.out.println(s5);
		
	//String to byte,byte to string there is no method 
	byte by=Byte.parseByte(s);
     System.out.println(by);
    
   	
	// converting char to string	// string to char not possible there is method in java
		char c='a';
		String s7=String.valueOf(c);
		System.out.println(s7);	
		
		String s8="This as arjan arom qa";
		
	/*	System.out.println(s8.length());
		System.out.println(s8.charAt(3));
		System.out.println(s8.substring(0, 10));
		System.out.println(s8.substring(1));
		System.out.println(s8.indexOf("i"));
		System.out.println(s8.lastIndexOf("a"));*/
		
		//String s8="This as arjan arom qa";
		//System.out.println(s8.indexOf("a"));//it will print first a 
		//System.out.println(s8.indexOf('a', s8.indexOf('a')+1));// it will print 2nd a
		//System.out.println(s8.indexOf('a', s8.indexOf('a', s8.indexOf('a')+1)+1));// it will print 3rd a
		//System.out.println(s8.indexOf('a',s8.indexOf('a', s8.indexOf('a', s8.indexOf('a')+1)+1)+1));// it will print 4th a
		//System.out.println(s8.indexOf('a',s8.indexOf('a',s8.indexOf('a', s8.indexOf('a', s8.indexOf('a')+1)+1)+1)+1));// it will print last a for last letter we have another method lastIndexOf(args);
		
		/*int firstA=s8.indexOf("a");
		System.out.println(firstA);
		
		int secondA=s8.indexOf('a', firstA+1);
		System.out.println(secondA);
		
		int thirdA=s8.indexOf('a', secondA+1);
		System.out.println(thirdA);
		
		int forthA=s8.indexOf('a', thirdA+1);
		System.out.println(forthA);
		
		int fifthA=s8.indexOf('a', forthA+1);
		System.out.println(fifthA);*/
				
		String arjun="seleniumseleniumqaqaseleniumqaseleniumqa";
			
		System.out.println(arjun.indexOf('s'));
		System.out.println(arjun.indexOf('e', arjun.indexOf('e')+1));
			
	}
}
