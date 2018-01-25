package looping;

import java.util.Scanner;

public class DoWhile extends SwitchCase {
	private Scanner n;
	public void checkingDo() {
n = new Scanner(System.in);
System.out.println("enter id <10");
int a=n.nextInt();
do {
	if (a<=10) {
		System.out.println("the entered id is <10 value is"+a);
		System.exit(1);

		
	}
	else {if(a>=11)
		System.out.println("the entered value is not correct");

	}
	a++;
} while (a<10);



	}
public static void main(String[] args) {
	DoWhile a = new DoWhile();
	a.checkingDo();
}
}
