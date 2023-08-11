//take two matrix (3X3) add perform actions like addition, substraction, multiplication as per users requirement

import java.util.Scanner;

public class add {//For Addition Purpose
	void addition(int[][] a,int[][] b) {
		int[][] c=new int[3][3];
		System.out.println("ADDITION:-");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println("");
		}
	
		
	}
	void substraction(int a[][],int[][] b) {//For Substraction purpose
		int[][] c=new int[3][3];
		System.out.println("SUBTRACTION:-");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print("c["+i+"]["+j+"]="+c[i][j]);
				
			}
			System.out.println("");
		}
		
	}
	void multiplication(int[][] a,int[][] b) {//For Multiplication purpose
		int[][] c=new int[3][3];
		System.out.println("MULTIPLICATION:-");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]);
				
			}
			System.out.println("");
		}
		
		
	}

	public static void main(String[] args) {
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of 1st array:-\n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("a["+i+"]["+j+"]=");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter values of 2nd array:-\n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("b["+i+"]["+j+"]=");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\nEnter your choice of action:-");
		int s=sc.nextInt();
		add d=new add();
		if(s==1) {
			d.addition(a,b);
		}
		else if(s==2) {
			d.substraction(a,b);
		}
		else if(s==3) {
			d.multiplication(a,b);
			
		}
		else {
			System.out.println("OUT OF CHOICE");
		}
	}

}

