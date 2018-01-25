package looping;

import java.util.Scanner;

public class WhileLooping extends DoWhile {
	public void checkingWhile() {
		Scanner n= new Scanner(System.in);
		System.out.println("enter the string");
		String a=n.nextLine();
				while (a=="siranj") {
					System.out.println("the enter string is correct");


} 
				System.out.println("the entered string is not correct");

		
		
	}
public static void main(String[] args) {
	WhileLooping a =new WhileLooping();
	a.checkingWhile();
}
}
