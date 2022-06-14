// 1) Use case-1

package utility;

import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
			
		int capitalLetter=0;
		int smallLetter=0;
		int digits=0;
		int specialSymbols=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email ");
		String email=sc.next();
		
		char[] ch=email.toCharArray();
		
		for(char i:ch) {
			if (Character.isUpperCase(i)) {
				capitalLetter++;
			}
			else if (Character.isLowerCase(i)) {
				smallLetter++;
			}
			else if (Character.isDigit(i)) {
				digits++;
				
			}
			else {
				specialSymbols++;
			}
		}
		
		
		System.out.println("Number of Capital Letters : "+capitalLetter);
		System.out.println("Number of Small Letters : "+smallLetter);
		System.out.println("Number of Digits : "+digits);
		System.out.println("Number of Special Symbols : "+specialSymbols);
		
		
	}

}

// Output:
// =============
// Enter the Email 
// Harsha@123.varDhan
// Number of Capital Letters : 2
// Number of Small Letters : 11
// Number of Digits : 3
// Number of Special Symbols : 2

