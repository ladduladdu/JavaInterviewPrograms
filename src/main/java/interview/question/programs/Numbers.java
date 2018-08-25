package interview.question.programs;

public class Numbers extends PrintingPattern

{
	public static void main(String[] args) {
/*
		
		 * for (int i = 1; i <=100; i++) { if (i%2==0) {
		 * System.out.println("Even number"+i); } else {
		 * System.out.println("odd number"+i); }
		 * 
		 * }
		 
		
		 * for (int i = 1; i <=100; i++) { if (i%2==0) {
		 * 
		 * System.out.println("Not a prime number"+i);
		 * 
		 * }else { System.out.println(" prime number"+i); }
		 * 
		 * }
		 

		
		 * int value=1;
		 * 
		 * for (int i = 1; i <=4; i++) {// to check factorial value=value*i; }
		 * System.out.println(value);
		 

		
		 * int n=2; for (int i = 5; i <=10; i++) {//printing multipliction table for
		 * (int j = 1; j <=10; j++) { System.out.println(i+" X " +j+ "="+i*j); } }
		 

		
		 * int n=2; for (int i = 1; i <=10; i++) { System.out.println(n+
		 * " X "+i+" = "+n*i);
		 * 
		 * }
		 

		
		 * int rev=0; int n=12345; int x;
		 * 
		 * while(n>0)//printing revrse integer { x=n%10; rev=rev*10+x; n=n/10; }
		 * System.out.println(rev); }
		

		{

			
			  int i,n=9,next,first=0,second=1; 
			  for ( i = 0; i <n; i++) {
			  next=first+second;//0+1 
			 first=second;//1 
			  second=next;//1
			  System.out.println(first);//0 }
			 

			int i, n, a, d;
			n = 111;
			d = n;
			i = 0;
			while (n > 0) {// arm stong numbers

				a = n % 10;
				n = n / 10;
				i = i + a * a * a;
			}
			if (i == d) {

				System.out.println("Arm strong");

			} else {
				System.out.println("not Arm strong");
			}

			/*
			 * int a,b,c,abc; a=10; b=25; c=5; abc=(a>b)?(a>c?a:c):(a>b?a:b);// ternary
			 * shorthand for if then else statement
			 * 
			 * System.out.println(abc);
			 */

			/*
			 * int n,a;//printing number length n=1000; a=0;
			 * 
			 * if (n<0) {
			 * 
			 * a=n*-1; } else if(n==0) { n=1; } while (n>0) { n=n/10; a++; }
			 * System.out.println(a);
			 */

			/*
			 * int n=1000; int s=String.valueOf(n).length();// printing number length
			 * System.out.println(s);
			 */

			// replacing the word whose number multiply with 3 & 5
			/*
			 * for (int i = 1; i <=20; i++) { if (i%(3*5)==0) { System.out.println("ar35");
			 * } else if(i%3==0){ System.out.println("ar3");
			 * 
			 * } else if(i%5==0){ System.out.println("ar5"); } else { System.out.println(i);
			 * } }
			 */

		}
	}

