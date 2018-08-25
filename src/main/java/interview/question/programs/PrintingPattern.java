package interview.question.programs;

public class PrintingPattern {

	public static void main(String[] args) {

//		for (int i = 0; i <=5; i++) {
//			for (int j = 0; j <i; j++) {// printing *
//				System.out.print("*");
//			}						
//			System.out.println("");
//		}
//
//		for (int i = 0; i <=5; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print(j+" ");//printing trangle 1 12 123 
//			}
//			System.out.println("");
//		}
//		for (int i = 1; i <=5; i++) {
//		for (int j = 1; j <=i; j++) {
//			System.out.print(i+" ");// priting traingle 1 2 2 333 4444
//		}
//		System.out.println("");
//	}
//		
//		int i,k,j;
//		for ( i = 1; i <=5; i++) 
//		{
//			for (j = i; j <5; j++)
//				System.out.print(" ");
//			for ( k = 1; k <(i*2); k++) 
//				System.out.print("*");	
//			System.out.println("");
//		}
//		for ( i =4; i>=1; i--)  
//		{
//			for (j =5; j>i; j--)
//				System.out.print(" ");
//			for ( k = 1; k <(i*2); k++) 
//				System.out.print("*");	
//			System.out.println("");
//		}
//		int number,i,k;
//		int count=1;
//		number=5;
//		count=number-1;
//		for (k = 1; k <=number; k++) {
//			for ( i = 1; i <=count; i++) 
//				System.out.print(" ");
//				count--;
//				for ( i = 1; i <2*k-1; i++) 
//					System.out.print("*");	
//				System.out.println(" ");
//				}
//				count=1;
//				for ( k = 1; k <number-1; k++) {
//					for ( i = 1; i <=count; i++) 
//						System.out.print(" ");
//						count++;
//						for ( i = 1; i <2*(number-k)-1; i++) 
//							System.out.print("*");
//							System.out.println(" ");
//						
			//	}
	

		int i,j,k=1;
		for ( i = 1; i <=5; i++) {
		for ( j = 1; j <i; j++) {
			System.out.print(k++ +" ");
		}			
		System.out.println(" ");
	}

	}
}

