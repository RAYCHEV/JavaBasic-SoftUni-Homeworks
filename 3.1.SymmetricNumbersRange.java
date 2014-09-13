import java.util.Scanner;

public class SymmetricNumbersRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		char ch[];
		for (int i = start; i < end; i++) {
			
			if (i>=0 && i<=9) {
				System.out.print(i+" ");
			}
			ch = Integer.toString(i).toCharArray();
			if (ch.length==2) {
				if (ch[0] == ch[1]) {
					System.out.print(i+" ");
				}
			}
			else if (ch.length==3) { 
				if (ch[0] == ch[2]) {
				System.out.print(i+" ");
				}
			}
		}
	}
}
/*
Write a program to generate and print all symmetric numbers in given range [start…end] 
(0 ≤ start ≤ end ≤ 999). A number is symmetric if its digits are symmetric
toward its middle. For example, the numbers 101, 33, 989 and 5 are symmetric, 
but 102, 34 and 997 are not symmetric
*/
