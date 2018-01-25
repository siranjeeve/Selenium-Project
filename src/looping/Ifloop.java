package looping;

import java.util.Scanner;

public class Ifloop extends WhileLooping{
	public void checkingIF() {
		Scanner n=new Scanner(System.in);
		System.out.println("Hai plz enter the Id values 90 or 100");
		int a=n.nextInt();
	if (a==90 && a==100) {
		System.out.println("Its n correct id");
		
	} else {
System.out.println("The entered id is wrong");
	}

	}
	public static void main(String[] args) {
		Ifloop n=new Ifloop();
		n.checkingIF();
		n.checkingWhile();
		n.checkingDo();
		n.checkingSwitch();
		
	}

}
 