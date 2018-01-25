package looping;

import java.util.Scanner;

public class SwitchCase {
	public void checkingSwitch() {
Scanner a=new Scanner(System.in);
System.out.println("enter your choices of switch");
String s=a.next();
switch (s) {
case "ass":
	System.out.println("entering case1");
	break;
case "bss":
	System.out.println("entering case2");
	
    break;
    
case "css":
    System.out.println("entering case3");
    break;

default:
	System.out.println("the entered value is not in switch");
	break;
}

	}
	public static void main(String[] args) {
		SwitchCase a = new SwitchCase();
		a.checkingSwitch();
	}

}
