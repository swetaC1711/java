//find magicnumber that is-> 1458=1+4+5+8==>18
//18*81=1458    magic-number

import java.util.Scanner;

public class magic {
	void Check(int a) {
		int r=0,rev=0,digit,org=a,q = 0;
		while(a>0) {
			digit=a%10;
			r=r+digit;
			q=r;
			a=a/10;
		}
		while(r>0) {
			digit=r%10;
			rev=rev*10+digit;
			r=r/10;
		}
		if(q*rev==org) {
			System.out.println("magic number");
		}
		else {
			System.out.println("not a magic number");
		}
		
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
			magic number=new magic();
			number.Check(a);
		}

	}

}
