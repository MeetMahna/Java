package test;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		/*
		User Input Demo -------------------------------------------------------------
		 */
		Scanner scan = new Scanner(System.in);	
		System.out.print("Enter any number: ");
        // This method reads the number provided using keyboard
		int num = scan.nextInt();

		scan.nextLine(); // This line you have to add (It consumes the \n character)
		
		// reads string before any space
		System.out.print("Enter any string with space: ");
		String st1 = scan.nextLine();
				
		// reads string before any space
		System.out.print("Enter any string without space: ");
		String st = scan.next();
		
		
		
		// Displaying the number 
        System.out.println("The number entered by user: "+num);
        System.out.println("The string entered by user: "+st1);
        System.out.println("The string entered by user: "+st);
        
        
        /*
        Check number entered by user is +ve or -ve ----------------------------------
        */
        
        
        System.out.print("Enter a number:");
        int n = scan.nextInt();
        
        if (n>0) System.out.println(n+" is positive");
        else if (n<0) System.out.println(n+ " is negative");
        else System.out.println(n+" is neither positive nor negative");
        
       
 		/*
 		 * Getting ASCII Value of characters ------------------------------------------
 		 */
 		char ch = 'A';
 		char ch1 = 'a';
        int asciiCode = ch;
        // type casting char as int
        int asciiValue = (int)ch1;

        System.out.println("ASCII value of "+ch+" is: " + asciiCode);
        System.out.println("ASCII value of "+ch1+" is: " + asciiValue);
        
        /*
 		 * Check input is a vowel or consonant using switch case------------------------
 		 */
        

        do{
        	System.out.println("Enter a character: ");
        	char inp = scan.next().charAt(0);
	        boolean vowel = false;
	        switch(inp) {
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		    	case 'A':
		        case 'E':
		        case 'I':
		        case 'O':
		        case 'U':vowel = true;
	        }
	        if (vowel){
	        	System.out.println(inp+ " is a vowel");
	        }
	        else if ((inp>='a' && inp<='z') || (inp>='A' && inp<='Z')) {
	        	System.out.println(inp+ " is a consonant");
	        }
	        else {
	        	System.out.println(inp+ " is not a character");
	        }
	        System.out.print("Enter 0 to exit: ");
        } while(scan.next().charAt(0)!='0');   
        
        // Closing the scanner
 		scan.close();	
 		
 		
	}

}
