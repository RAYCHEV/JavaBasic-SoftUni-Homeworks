import java.util.Scanner;

public class Generate3LetterWords {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char []ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int ii = 0; ii < ch.length; ii++) {
				for (int iii = 0; iii < ch.length ; iii++) {
					System.out.print(ch[i]);
					System.out.print(ch[ii]);
					System.out.print(ch[iii]);
					System.out.print(" ");
				}
			}
		}
	}
}

/*
Write a program to generate and print all 3-letter words consisting of given set of characters.
For example if we have the characters 'a' and 'b', all possible words will be "aaa", "aab", "aba",
"abb", "baa", "bab", "bba" and "bbb". The input characters are given as string at the first line of the input. 
Input characters are unique (there are no repeating characters).
*/
