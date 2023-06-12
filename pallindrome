package matrix;

import java.util.Scanner;


public class plindrome {
	int pal(int a) {
		int result,rev=0,flag=0;
		while(a>0) {
		result=a%10;
		rev=rev*10+result;
		a=a/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		plindrome p=new plindrome();
		int s=p.pal(a);
		if(s==a) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
		
		

	}

}
