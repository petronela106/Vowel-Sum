package vowelSum;

import java.util.Scanner;

//Reads n - the count of characters:
//Adds a character’s value to the result if it is a vowel
//character a e i o u
//value     1 2 3 4 5
//Prints the result
 
public class VowelSum {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       int n = Integer.parseInt(scanner.nextLine());
	       int result = 0;
	       for(int i = 0; i < n; i ++){
	           String s = scanner.nextLine();  
	           if(s.equals("a")){
	               result += 1;
	           }
	           if(s.equals("e")){
	               result += 2;
	           }
	           if(s.equals("i")){
	               result += 3;
	           }
	           if(s.equals("o")){
	               result += 4;
	           }
	           if(s.equals("u")){
	               result += 5;
	           }
	       }
	       System.out.println(result);
	    }
	}
